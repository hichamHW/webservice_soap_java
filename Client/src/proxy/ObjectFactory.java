
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Check_QNAME = new QName("http://webservices/", "check");
    private final static QName _CheckResponse_QNAME = new QName("http://webservices/", "checkResponse");
    private final static QName _PersonsResponse_QNAME = new QName("http://webservices/", "personsResponse");
    private final static QName _Persons_QNAME = new QName("http://webservices/", "persons");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Persons }
     * 
     */
    public Persons createPersons() {
        return new Persons();
    }

    /**
     * Create an instance of {@link PersonsResponse }
     * 
     */
    public PersonsResponse createPersonsResponse() {
        return new PersonsResponse();
    }

    /**
     * Create an instance of {@link CheckResponse }
     * 
     */
    public CheckResponse createCheckResponse() {
        return new CheckResponse();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "check")
    public JAXBElement<Check> createCheck(Check value) {
        return new JAXBElement<Check>(_Check_QNAME, Check.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "checkResponse")
    public JAXBElement<CheckResponse> createCheckResponse(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_CheckResponse_QNAME, CheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "personsResponse")
    public JAXBElement<PersonsResponse> createPersonsResponse(PersonsResponse value) {
        return new JAXBElement<PersonsResponse>(_PersonsResponse_QNAME, PersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "persons")
    public JAXBElement<Persons> createPersons(Persons value) {
        return new JAXBElement<Persons>(_Persons_QNAME, Persons.class, null, value);
    }

}
