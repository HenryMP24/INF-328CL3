
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Operation_QNAME = new QName("http://mavenproject5.mycompany.com/", "operation");
    private final static QName _Cambiaremos_QNAME = new QName("http://mavenproject5.mycompany.com/", "cambiaremos");
    private final static QName _CambiaremosResponse_QNAME = new QName("http://mavenproject5.mycompany.com/", "cambiaremosResponse");
    private final static QName _OperationResponse_QNAME = new QName("http://mavenproject5.mycompany.com/", "operationResponse");
    private final static QName _DevuelveResponse_QNAME = new QName("http://mavenproject5.mycompany.com/", "devuelveResponse");
    private final static QName _Devuelve_QNAME = new QName("http://mavenproject5.mycompany.com/", "devuelve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Devuelve }
     * 
     */
    public Devuelve createDevuelve() {
        return new Devuelve();
    }

    /**
     * Create an instance of {@link DevuelveResponse }
     * 
     */
    public DevuelveResponse createDevuelveResponse() {
        return new DevuelveResponse();
    }

    /**
     * Create an instance of {@link Cambiaremos }
     * 
     */
    public Cambiaremos createCambiaremos() {
        return new Cambiaremos();
    }

    /**
     * Create an instance of {@link CambiaremosResponse }
     * 
     */
    public CambiaremosResponse createCambiaremosResponse() {
        return new CambiaremosResponse();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mavenproject5.mycompany.com/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cambiaremos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mavenproject5.mycompany.com/", name = "cambiaremos")
    public JAXBElement<Cambiaremos> createCambiaremos(Cambiaremos value) {
        return new JAXBElement<Cambiaremos>(_Cambiaremos_QNAME, Cambiaremos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiaremosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mavenproject5.mycompany.com/", name = "cambiaremosResponse")
    public JAXBElement<CambiaremosResponse> createCambiaremosResponse(CambiaremosResponse value) {
        return new JAXBElement<CambiaremosResponse>(_CambiaremosResponse_QNAME, CambiaremosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mavenproject5.mycompany.com/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevuelveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mavenproject5.mycompany.com/", name = "devuelveResponse")
    public JAXBElement<DevuelveResponse> createDevuelveResponse(DevuelveResponse value) {
        return new JAXBElement<DevuelveResponse>(_DevuelveResponse_QNAME, DevuelveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Devuelve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mavenproject5.mycompany.com/", name = "devuelve")
    public JAXBElement<Devuelve> createDevuelve(Devuelve value) {
        return new JAXBElement<Devuelve>(_Devuelve_QNAME, Devuelve.class, null, value);
    }

}
