package com.abc;

/**    数据结构:
 *      线性表
 *      非线性表
 *      树
 *      图
 *      队列
 *      栈
 *      1、写出某种排序算法
 *          冒泡排序
 *          选择排序
 *          插入排序
 *          快速排序
 *      2、排序算法的时间复杂度（空间复杂度）
 *          衡量一个数据结构是否合适的衡量标准
 *      3、排序算法的稳定性
 *          排序之后的值跟排序之前的值位置是否发生改变
 */
public class ArraySort {
    public static void main(String[] args) {

        int[] arr = {1,5,4,6,9,7,8,3,2};
        ///排序从小到大
        //冒泡排序
        int t = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =0;j<arr.length-1-i;j++ ){
                if (arr[j]>arr[j+1]){
//                    t = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = t;
                    sort(arr,j);
                }
            }
        }
        print(arr);
    }
    public static void sort(int[]arr,int num){
        int t = arr[num];
        arr[num] = arr[num+1];
        arr[num+1] = t;
    }
    public static int[] print(int[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        return a;
    }
}
