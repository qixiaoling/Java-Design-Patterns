package Proxy.Filtering;

import javax.management.relation.Relation;
import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static final List<String> bannenSites;
    private final Internet internet = new RealInternet();

    static {
        bannenSites = new ArrayList<>();
        bannenSites.add("banned.com");
    }
    @Override
    public void connectTo(String host) {
        if(bannenSites.contains(host)){
            System.out.println("Access Denied to " + host);
            return;
        }
        internet.connectTo(host);
    }
}
