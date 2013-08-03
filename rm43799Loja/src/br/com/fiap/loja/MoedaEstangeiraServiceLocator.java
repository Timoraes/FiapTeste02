/**
 * MoedaEstangeiraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.loja;

public class MoedaEstangeiraServiceLocator extends org.apache.axis.client.Service implements br.com.fiap.loja.MoedaEstangeiraService {

    public MoedaEstangeiraServiceLocator() {
    }


    public MoedaEstangeiraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MoedaEstangeiraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MoedaEstangeira
    private java.lang.String MoedaEstangeira_address = "http://10.3.1.36:8080/rm43799kiosque/services/MoedaEstangeira";

    public java.lang.String getMoedaEstangeiraAddress() {
        return MoedaEstangeira_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MoedaEstangeiraWSDDServiceName = "MoedaEstangeira";

    public java.lang.String getMoedaEstangeiraWSDDServiceName() {
        return MoedaEstangeiraWSDDServiceName;
    }

    public void setMoedaEstangeiraWSDDServiceName(java.lang.String name) {
        MoedaEstangeiraWSDDServiceName = name;
    }

    public br.com.fiap.loja.MoedaEstangeira getMoedaEstangeira() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MoedaEstangeira_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMoedaEstangeira(endpoint);
    }

    public br.com.fiap.loja.MoedaEstangeira getMoedaEstangeira(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fiap.loja.MoedaEstangeiraSoapBindingStub _stub = new br.com.fiap.loja.MoedaEstangeiraSoapBindingStub(portAddress, this);
            _stub.setPortName(getMoedaEstangeiraWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMoedaEstangeiraEndpointAddress(java.lang.String address) {
        MoedaEstangeira_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fiap.loja.MoedaEstangeira.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fiap.loja.MoedaEstangeiraSoapBindingStub _stub = new br.com.fiap.loja.MoedaEstangeiraSoapBindingStub(new java.net.URL(MoedaEstangeira_address), this);
                _stub.setPortName(getMoedaEstangeiraWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MoedaEstangeira".equals(inputPortName)) {
            return getMoedaEstangeira();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://loja.fiap.com.br", "MoedaEstangeiraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://loja.fiap.com.br", "MoedaEstangeira"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MoedaEstangeira".equals(portName)) {
            setMoedaEstangeiraEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
