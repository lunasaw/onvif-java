
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.5
 * Generated source version: 4.0.5
 */

@WebFault(name = "TopicNotSupportedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class TopicNotSupportedFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType faultInfo;

    public TopicNotSupportedFault() {
        super();
    }

    public TopicNotSupportedFault(String message) {
        super(message);
    }

    public TopicNotSupportedFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public TopicNotSupportedFault(String message, org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType topicNotSupportedFault) {
        super(message);
        this.faultInfo = topicNotSupportedFault;
    }

    public TopicNotSupportedFault(String message, org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType topicNotSupportedFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = topicNotSupportedFault;
    }

    public org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
