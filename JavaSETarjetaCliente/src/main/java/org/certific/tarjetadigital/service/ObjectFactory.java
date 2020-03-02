
package org.certific.tarjetadigital.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.certific.tarjetadigital.service package. 
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

    private final static QName _ObtenerInscripciones_QNAME = new QName("http://Service.TarjetaDigital.certific.org/", "ObtenerInscripciones");
    private final static QName _ObtenerInscripcionesResponse_QNAME = new QName("http://Service.TarjetaDigital.certific.org/", "ObtenerInscripcionesResponse");
    private final static QName _CrearInscripcionResponse_QNAME = new QName("http://Service.TarjetaDigital.certific.org/", "CrearInscripcionResponse");
    private final static QName _CrearInscripcion_QNAME = new QName("http://Service.TarjetaDigital.certific.org/", "CrearInscripcion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.certific.tarjetadigital.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearInscripcion }
     * 
     */
    public CrearInscripcion createCrearInscripcion() {
        return new CrearInscripcion();
    }

    /**
     * Create an instance of {@link CrearInscripcionResponse }
     * 
     */
    public CrearInscripcionResponse createCrearInscripcionResponse() {
        return new CrearInscripcionResponse();
    }

    /**
     * Create an instance of {@link ObtenerInscripcionesResponse }
     * 
     */
    public ObtenerInscripcionesResponse createObtenerInscripcionesResponse() {
        return new ObtenerInscripcionesResponse();
    }

    /**
     * Create an instance of {@link ObtenerInscripciones }
     * 
     */
    public ObtenerInscripciones createObtenerInscripciones() {
        return new ObtenerInscripciones();
    }

    /**
     * Create an instance of {@link Inscripcion }
     * 
     */
    public Inscripcion createInscripcion() {
        return new Inscripcion();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInscripciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.TarjetaDigital.certific.org/", name = "ObtenerInscripciones")
    public JAXBElement<ObtenerInscripciones> createObtenerInscripciones(ObtenerInscripciones value) {
        return new JAXBElement<ObtenerInscripciones>(_ObtenerInscripciones_QNAME, ObtenerInscripciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInscripcionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.TarjetaDigital.certific.org/", name = "ObtenerInscripcionesResponse")
    public JAXBElement<ObtenerInscripcionesResponse> createObtenerInscripcionesResponse(ObtenerInscripcionesResponse value) {
        return new JAXBElement<ObtenerInscripcionesResponse>(_ObtenerInscripcionesResponse_QNAME, ObtenerInscripcionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearInscripcionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.TarjetaDigital.certific.org/", name = "CrearInscripcionResponse")
    public JAXBElement<CrearInscripcionResponse> createCrearInscripcionResponse(CrearInscripcionResponse value) {
        return new JAXBElement<CrearInscripcionResponse>(_CrearInscripcionResponse_QNAME, CrearInscripcionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearInscripcion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.TarjetaDigital.certific.org/", name = "CrearInscripcion")
    public JAXBElement<CrearInscripcion> createCrearInscripcion(CrearInscripcion value) {
        return new JAXBElement<CrearInscripcion>(_CrearInscripcion_QNAME, CrearInscripcion.class, null, value);
    }

}
