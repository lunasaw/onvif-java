
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 */

@WebFault(name = "InvalidMessageContentExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidMessageContentExpressionFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType faultInfo;

    public InvalidMessageContentExpressionFault() {
        super();
    }

    public InvalidMessageContentExpressionFault(String message) {
        super(message);
    }

    public InvalidMessageContentExpressionFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidMessageContentExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType invalidMessageContentExpressionFault) {
        super(message);
        this.faultInfo = invalidMessageContentExpressionFault;
    }

    public InvalidMessageContentExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType invalidMessageContentExpressionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidMessageContentExpressionFault;
    }

    public org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
