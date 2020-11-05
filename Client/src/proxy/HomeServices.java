
package proxy;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HomeServices", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HomeServices {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "persons", targetNamespace = "http://webservices/", className = "proxy.Persons")
    @ResponseWrapper(localName = "personsResponse", targetNamespace = "http://webservices/", className = "proxy.PersonsResponse")
    @Action(input = "http://webservices/HomeServices/personsRequest", output = "http://webservices/HomeServices/personsResponse")
    public List<Person> persons();

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "check", targetNamespace = "http://webservices/", className = "proxy.Check")
    @ResponseWrapper(localName = "checkResponse", targetNamespace = "http://webservices/", className = "proxy.CheckResponse")
    @Action(input = "http://webservices/HomeServices/checkRequest", output = "http://webservices/HomeServices/checkResponse")
    public boolean check();

}
