package Proxy.Filtering;

import java.sql.SQLOutput;

public class RealInternet implements Internet {
    @Override
    public void connectTo (String host) {
        System.out.println("Successfully opened connection to " + host);
    }
}
