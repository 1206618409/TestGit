package com.abc;
/*
     数组标识存储相同数据类型数据的有序集合
        特点：
            1、数组中存放的数据必须是同一个数据类型,可以是基本数据类型也可以是引用数据类型
            2、数组定义的时候必须要给定大小,且大小不可以改变
            3、可以通过下标值来获取数据,下标从0开始
            4、插入数组中的数据是有序集合,此时有序并不是指大小排序,而是指插入的顺序
        使用：
            1、声明数组
            2、创建空间
            3、赋值
            4、数组操作
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //声明数组
        int arr[];
        //创建内存空间
        arr = new int[5];
        //数组赋值
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        System.out.println(arr[0]);
        //输入5个数值，求平均值
        int[]arr2 = new int[]{56,88,556,77,73};
        int sum = 0;
        for (int i = 0;i<arr2.length;i++){
            sum += arr2[i];
        }
        System.out.println("平均值是"+sum/5);
        int []soo;
        //错误写法 soo = {156,8,9,66,6};
        soo = new int[]{156,8,9,66,6};

    }
}
