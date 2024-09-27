package io_demo.Randomcss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 10:32
 **/
public class RandomAccessFileTest {
    public static void main(String[] args) {
        File f = new File("doc.txt");
        //文件大小
        long l = f.length();
        //规定块的大小
        int blockSize = 1024;
        int size = (int)Math.ceil(l*1.0/blockSize);
        System.out.printf("要被切成《%s》个块",size);

        int beginPos = 0;
        int actualSize = (int)(blockSize>l?l:blockSize);
        for (int i = 0;i<size;i++){
            //每次读取块的时候的起始偏移量
            beginPos = i*blockSize;
            if(i==size-1){
                actualSize = (int)l;
            }else {
                actualSize = blockSize;
                l-=actualSize;
            }
            System.out.println(i+"---->起始位置是："+beginPos+"------>读取大小是："+actualSize);
            //readSplit(i,beginPos,actualSize);
        }

    }
    public static void readSplit(int i,int beginPos,int actualSize){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("doc.txt"),"r");
            //表示从哪个偏移量开始读取数据
            randomAccessFile.seek(beginPos);
            byte[]bytes = new byte[1024];
            int length = 0;
            while((length=randomAccessFile.read(bytes))!=-1){
                if (actualSize>length){
                    System.out.println(new String(bytes,0,length));
                    actualSize-=length;
                }else{
                    System.out.println(new String(bytes,0,actualSize));
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


