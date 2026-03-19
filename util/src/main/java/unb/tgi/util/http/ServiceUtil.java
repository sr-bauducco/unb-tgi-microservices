package unb.tgi.util.http;

import org.springframework.stereotype.Component;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class ServiceUtil {
    public String getServiceAddress() {
        try {
            return InetAddress.getLocalHost().getHostName() + "/" + InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return "unknown host";
        }
    }
}