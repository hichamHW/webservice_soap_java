import proxy.Home;
import proxy.HomeServices;

public class client {
    public static void main(String[] args) {

        HomeServices webservices = new Home().getHomeServicesPort();
        System.out.println(webservices.persons());
        System.out.println(webservices.check());
    }
}
