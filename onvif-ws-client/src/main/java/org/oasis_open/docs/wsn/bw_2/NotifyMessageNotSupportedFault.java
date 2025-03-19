
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 */

@WebFault(name = "NotifyMessageNotSupportedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class NotifyMessageNotSupportedFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType faultInfo;

    public NotifyMessageNotSupportedFault() {
        super();
    }

    public NotifyMessageNotSupportedFault(String message) {
        super(message);
    }

    public NotifyMessageNotSupportedFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public NotifyMessageNotSupportedFault(String message, org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType notifyMessageNotSupportedFault) {
        super(message);
        this.faultInfo = notifyMessageNotSupportedFault;
    }

    public NotifyMessageNotSupportedFault(String message, org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType notifyMessageNotSupportedFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = notifyMessageNotSupportedFault;
    }

    public org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
