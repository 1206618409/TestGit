package io_demo.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("AA.txt");
        OutputStream ops = null;
        try {
            ops = new FileOutputStream(file);
            try {
                ops.write(99);
                ops.write("\r\naaa".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
