package io_demo.CharArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-06 19:47
 **/
public class ExitTest {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String str = "";
            while(!str.equals("exit")){
                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();
                System.out.println();
            }
        } catch (IOException e) {
                e.printStackTrace();
        }finally {
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


