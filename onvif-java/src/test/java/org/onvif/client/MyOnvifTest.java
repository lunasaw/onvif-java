package org.onvif.client;

import de.onvif.soap.OnvifDevice;
import lombok.SneakyThrows;
import org.onvif.ver10.media.wsdl.GetOSD;
import org.onvif.ver10.media.wsdl.GetOSDResponse;
import org.onvif.ver10.media.wsdl.ObjectFactory;
import org.onvif.ver10.schema.*;

import java.util.List;

/**
 * @author luna
 * @date 2025/1/11
 */
public class MyOnvifTest {

    @SneakyThrows
    public static void main(String[] args) {
        String ip = "172.25.5.68:18080";
        String userName = "admin";
        String password = "weidian@2023";

        OnvifDevice onvifDevice = new OnvifDevice(ip, userName, password);

        ObjectFactory  objectFactory = new ObjectFactory();
        GetOSD getOSD = objectFactory.createGetOSD();
        List<Profile> profiles = onvifDevice.getMedia().getProfiles();
        System.out.println(profiles);
        String token = getVideoSourceToken(onvifDevice);
        getOSD.setOSDToken(token);
        List<OSDConfiguration> osDs = onvifDevice.getMedia().getOSDs(token);
        System.out.println(osDs);

        for (OSDConfiguration osD : osDs) {
            String token1 = osD.getToken();

            getOSD.setOSDToken(token1);
            GetOSDResponse osd = onvifDevice.getMedia().getOSD(getOSD);
            System.out.println(osd);
        }

    }

    /**
     * 获取视频源token， 用于osd
     * @param onvifDevice
     * @return
     */
    private static String getVideoSourceToken(OnvifDevice onvifDevice) {
        List<Profile> profiles = onvifDevice.getMedia().getProfiles();
        String encoderToken = "";
        for(Profile profile : profiles) {
            VideoSourceConfiguration videoSourceConfiguration = profile.getVideoSourceConfiguration();
            if(videoSourceConfiguration == null) {
                return null;
            }
            encoderToken = videoSourceConfiguration.getToken();
            break;
        }
        return encoderToken;
    }
}
