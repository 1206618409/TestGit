package io_demo.buffer;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 15:41
 **/
public class DataDemo {
    public static void main(String[] args) {
        FileInputStream f = null;
        FileOutputStream f1 = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            //向文件写入数据
            f1 = new FileOutputStream("ccc.txt");
            dataOutputStream = new DataOutputStream(f1);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeShort(155);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeUTF("abc");
            dataInputStream = new DataInputStream(f);
            f = new FileInputStream("ccc.txt");
            dataInputStream = new DataInputStream(f);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


