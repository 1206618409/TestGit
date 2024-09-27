package io_demo.reader;

import java.io.File;
import java.io.IOException;

/**
 * File 提供了当前文件系统中文件的部分操作
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.canExecute();
        file.canRead();
        file.canWrite();
        //判断当前文件是否存在
        System.out.println(file.exists());
        //获取文件的名称
        System.out.println(file.getName());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径，如果文件的路径只包含文件名称，则显示空
        System.out.println(file.getParentFile());
        System.out.println(file.getCanonicalPath());
        //返回操作系统的文件分隔符
        System.out.println(File.separator);
        //无论当前文件是否存在，只要给定具体的路径，都可以返回相应的路径名称
        File file2 = new File("d:/");
        System.out.println(file2.getAbsolutePath());
        //判断文件是否是文件或者目录
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());

        String[] list = file2.list();
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("------------------------------------");
        File[] files = file2.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        System.out.println("--------------------");
        File[] files1 = File.listRoots();//获取可用的文件系统根
        for (int i = 0; i < files1.length; i++) {
            System.out.println(files1[i]);
        }
    }



}
