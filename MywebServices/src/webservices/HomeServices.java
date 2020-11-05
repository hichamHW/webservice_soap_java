package webservices;

import models.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebService(serviceName = "home")
public class HomeServices {

    @WebMethod(operationName = "check")
    public  boolean check(){
        return true;
    }

    @WebMethod(operationName = "persons")
    public List<Person> getPersons(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"hicham benhachem",new Date(),"062738134"));
        personList.add(new Person(2,"widad benhachem",new Date(),"06274234"));
        personList.add(new Person(4,"driss benhachem",new Date(),"06222134"));
        personList.add(new Person(5,"ahmed benhachem",new Date(),"065548134"));
//        personList.forEach((p)->{
//            if(p.getId() == 1){
//                return p;
//            }
//        });
        return  personList;
    }

}
