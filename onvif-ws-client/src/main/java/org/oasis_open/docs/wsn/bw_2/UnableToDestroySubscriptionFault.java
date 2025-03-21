
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 */

@WebFault(name = "UnableToDestroySubscriptionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnableToDestroySubscriptionFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType faultInfo;

    public UnableToDestroySubscriptionFault() {
        super();
    }

    public UnableToDestroySubscriptionFault(String message) {
        super(message);
    }

    public UnableToDestroySubscriptionFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UnableToDestroySubscriptionFault(String message, org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType unableToDestroySubscriptionFault) {
        super(message);
        this.faultInfo = unableToDestroySubscriptionFault;
    }

    public UnableToDestroySubscriptionFault(String message, org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType unableToDestroySubscriptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = unableToDestroySubscriptionFault;
    }

    public org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
