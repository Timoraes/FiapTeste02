package br.com.fiap.loja;

public class MoedaEstangeiraProxy implements br.com.fiap.loja.MoedaEstangeira {
  private String _endpoint = null;
  private br.com.fiap.loja.MoedaEstangeira moedaEstangeira = null;
  
  public MoedaEstangeiraProxy() {
    _initMoedaEstangeiraProxy();
  }
  
  public MoedaEstangeiraProxy(String endpoint) {
    _endpoint = endpoint;
    _initMoedaEstangeiraProxy();
  }
  
  private void _initMoedaEstangeiraProxy() {
    try {
      moedaEstangeira = (new br.com.fiap.loja.MoedaEstangeiraServiceLocator()).getMoedaEstangeira();
      if (moedaEstangeira != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)moedaEstangeira)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)moedaEstangeira)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (moedaEstangeira != null)
      ((javax.xml.rpc.Stub)moedaEstangeira)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.loja.MoedaEstangeira getMoedaEstangeira() {
    if (moedaEstangeira == null)
      _initMoedaEstangeiraProxy();
    return moedaEstangeira;
  }
  
  public int converterDolar(int valor) throws java.rmi.RemoteException{
    if (moedaEstangeira == null)
      _initMoedaEstangeiraProxy();
    return moedaEstangeira.converterDolar(valor);
  }
  
  
}