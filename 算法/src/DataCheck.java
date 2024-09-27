package src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class DataCheck {
    static int[] generateRamdomArray(){
        Random r = new Random();
        int[] arr = new int [10000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;
    }
    static void check(){
        int[] arr = generateRamdomArray();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        Arrays.sort(arr);
        //RubbleSort.sort(arr2);
        //InsertionSort.sort(arr2);
        ShellSort.sort(arr2);
        boolean same = true;
        for (int i = 0; i <arr2.length ; i++) {
            if(arr[i] != arr2[i]) same = false;
        }
        System.out.println(same == true ? "right": "wrong");
    }
    public static void main(String[] args) {
        //long befor = System.currentTimeMillis();
        check();
        //long after = System.currentTimeMillis();
        //System.out.println((after-befor));
    }

}
