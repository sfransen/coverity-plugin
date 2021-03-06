
package com.coverity.ws.v9;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "DefectServiceService", targetNamespace = "http://ws.coverity.com/v9", wsdlLocation = "http://frossi-wrkst:8081/ws/v9/defectservice?wsdl")
public class DefectServiceService
    extends Service
{

    private final static URL DEFECTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException DEFECTSERVICESERVICE_EXCEPTION;
    private final static QName DEFECTSERVICESERVICE_QNAME = new QName("http://ws.coverity.com/v9", "DefectServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://frossi-wrkst:8081/ws/v9/defectservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEFECTSERVICESERVICE_WSDL_LOCATION = url;
        DEFECTSERVICESERVICE_EXCEPTION = e;
    }

    public DefectServiceService() {
        super(__getWsdlLocation(), DEFECTSERVICESERVICE_QNAME);
    }

    public DefectServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns DefectService
     */
    @WebEndpoint(name = "DefectServicePort")
    public DefectService getDefectServicePort() {
        return super.getPort(new QName("http://ws.coverity.com/v9", "DefectServicePort"), DefectService.class);
    }

    private static URL __getWsdlLocation() {
        if (DEFECTSERVICESERVICE_EXCEPTION!= null) {
            throw DEFECTSERVICESERVICE_EXCEPTION;
        }
        return DEFECTSERVICESERVICE_WSDL_LOCATION;
    }

}
