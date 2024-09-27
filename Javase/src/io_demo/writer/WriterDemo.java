package io_demo.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        File f = new File("writer.txt");
        Writer w = null;
        try {
            w = new FileWriter(f);
            w.write("学习java");
            w.write("哼哈二将");
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
