package NetDemo.com.aaa;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 14:58
 **/
public class IneaddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress inetAdd = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAdd);
        System.out.println(inetAdd.getHostAddress());
        System.out.println(inetAdd.getHostName());
    }
}


