package com.abc;

public class ArrayTest {
    public static void main(String[] args) {
        String[] s = {"aaa","bbb","ccc","ddd","eee"};
        String[] ss = new String[6];
        System.arraycopy(s,0,ss,0,s.length);
        for (int i = 0; i < ss.length; i++) {
            System.out.print(ss[i]+" ");
        }
        System.out.println();

        int[][] arr = {{1,2},{1,2,3},{3,4}};
        int[][] arrbak = new int[3][];
//        System.arraycopy(arr,0,arrbak.length,0,arr.length);
//        arrbak[2][1] = 100;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//        }
//        System.out.println();
            //6.二维数组遍历求和操作：用二重循环求出二维数组b所有元素的和：
         int[][] b={{11},{21,22},{31,32,33}};
         int sum = 0;
         for (int i = 0;i<b.length;i++){
             for (int j = 0; j <b[i].length ; j++) {
                 System.out.print(b[i][j]+" ");
                 sum+=b[i][j];
             }
         }
        System.out.println();
        System.out.println(sum);
    }
}
