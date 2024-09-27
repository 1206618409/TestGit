package NetDemo.com.fff;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-10 11:47
 **/
public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(1002);
        byte[]bytes = new byte[1024];
        //用来接收传输过来的数据
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        //利用创建好的数据包对象来接收数据
        datagramSocket.receive(datagramPacket);
        //打印输出
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        datagramSocket.close();
    }
}


