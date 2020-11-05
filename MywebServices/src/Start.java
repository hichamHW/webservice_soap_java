import webservices.HomeServices;

import javax.xml.ws.Endpoint;

public class Start {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:4343/",new HomeServices());
    }
}
