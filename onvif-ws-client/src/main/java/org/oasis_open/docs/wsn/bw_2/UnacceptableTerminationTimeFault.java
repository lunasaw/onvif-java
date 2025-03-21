
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 */

@WebFault(name = "UnacceptableTerminationTimeFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnacceptableTerminationTimeFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType faultInfo;

    public UnacceptableTerminationTimeFault() {
        super();
    }

    public UnacceptableTerminationTimeFault(String message) {
        super(message);
    }

    public UnacceptableTerminationTimeFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UnacceptableTerminationTimeFault(String message, org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType unacceptableTerminationTimeFault) {
        super(message);
        this.faultInfo = unacceptableTerminationTimeFault;
    }

    public UnacceptableTerminationTimeFault(String message, org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType unacceptableTerminationTimeFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = unacceptableTerminationTimeFault;
    }

    public org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
