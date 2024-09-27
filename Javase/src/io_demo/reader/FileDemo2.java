package io_demo.reader;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //循环遍历输出C盘的所有文件的绝对路径

        printFile(new File("I:\\Common"));


    }
    public static void printFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                printFile(f);
            }
        }else {
            //System.out.println("此文件是一个具体的文件");
            System.out.println(file.getAbsolutePath());
        }

    }
}
