package NetDemo.com.fff;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 11:41
 **/
public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(1000);
        Scanner s = new Scanner(System.in);
        System.out.println("输出");
        String str = s.nextLine();

            DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),1002);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();

    }
}


