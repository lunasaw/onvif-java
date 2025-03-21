
package org.oasis_open.docs.wsrf.rw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 */

@WebFault(name = "ResourceUnknownFault", targetNamespace = "http://docs.oasis-open.org/wsrf/r-2")
public class ResourceUnknownFault extends Exception {

    private org.oasis_open.docs.wsrf.r_2.ResourceUnknownFaultType faultInfo;

    public ResourceUnknownFault() {
        super();
    }

    public ResourceUnknownFault(String message) {
        super(message);
    }

    public ResourceUnknownFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ResourceUnknownFault(String message, org.oasis_open.docs.wsrf.r_2.ResourceUnknownFaultType resourceUnknownFault) {
        super(message);
        this.faultInfo = resourceUnknownFault;
    }

    public ResourceUnknownFault(String message, org.oasis_open.docs.wsrf.r_2.ResourceUnknownFaultType resourceUnknownFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = resourceUnknownFault;
    }

    public org.oasis_open.docs.wsrf.r_2.ResourceUnknownFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
