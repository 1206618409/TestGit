package io_demo.buffer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 17:20
 **/
public class ObjectOutStreamDemo1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("cccc.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeUTF("https://www.baidu.com");
            oos.writeObject(new Person(1,"张三","123456"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


