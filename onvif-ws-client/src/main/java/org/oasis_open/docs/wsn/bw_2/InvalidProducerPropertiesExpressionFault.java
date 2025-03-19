
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 */

@WebFault(name = "InvalidProducerPropertiesExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidProducerPropertiesExpressionFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType faultInfo;

    public InvalidProducerPropertiesExpressionFault() {
        super();
    }

    public InvalidProducerPropertiesExpressionFault(String message) {
        super(message);
    }

    public InvalidProducerPropertiesExpressionFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidProducerPropertiesExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType invalidProducerPropertiesExpressionFault) {
        super(message);
        this.faultInfo = invalidProducerPropertiesExpressionFault;
    }

    public InvalidProducerPropertiesExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType invalidProducerPropertiesExpressionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidProducerPropertiesExpressionFault;
    }

    public org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
