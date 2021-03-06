
package com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClienteIdentidadValidarExpResp_QNAME = new QName("http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Resp-v2015.08", "clienteIdentidadValidarExpResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.osb.schema.fif.corp.cliente.identidad.validar.resp_v2015
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaTYPE }
     * 
     */
    public RespuestaTYPE createRespuestaTYPE() {
        return new RespuestaTYPE();
    }

    /**
     * Create an instance of {@link ClienteIdentidadValidarExpRespTYPE }
     * 
     */
    public ClienteIdentidadValidarExpRespTYPE createClienteIdentidadValidarExpRespTYPE() {
        return new ClienteIdentidadValidarExpRespTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteIdentidadValidarExpRespTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/OSB/schema/FIF/CORP/cliente/identidad/validar/Resp-v2015.08", name = "clienteIdentidadValidarExpResp")
    public JAXBElement<ClienteIdentidadValidarExpRespTYPE> createClienteIdentidadValidarExpResp(ClienteIdentidadValidarExpRespTYPE value) {
        return new JAXBElement<ClienteIdentidadValidarExpRespTYPE>(_ClienteIdentidadValidarExpResp_QNAME, ClienteIdentidadValidarExpRespTYPE.class, null, value);
    }

}
