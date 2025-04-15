
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.13
 * Generated source version: 3.3.13
 */

@WebFault(name = "UnrecognizedPolicyRequestFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnrecognizedPolicyRequestFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType faultInfo;

    public UnrecognizedPolicyRequestFault() {
        super();
    }

    public UnrecognizedPolicyRequestFault(String message) {
        super(message);
    }

    public UnrecognizedPolicyRequestFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UnrecognizedPolicyRequestFault(String message, org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType unrecognizedPolicyRequestFault) {
        super(message);
        this.faultInfo = unrecognizedPolicyRequestFault;
    }

    public UnrecognizedPolicyRequestFault(String message, org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType unrecognizedPolicyRequestFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = unrecognizedPolicyRequestFault;
    }

    public org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
