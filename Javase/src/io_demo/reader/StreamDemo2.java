package io_demo.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 编写IO留程序的时候一定要注意关闭流
 * 1、选择合适的IO流对象
 * 2、创建对象
 * 3、传输数据
 * 4、关闭流对象（占用系统资源）
 *
 *
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream("abc.txt");
            int len = 0;
            //添加缓冲区的方法
            byte[] b = new byte[1024];
            while((len = in.read(b,5,5))!=-1){
                System.out.println(new String(b,5,len));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
