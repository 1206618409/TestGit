package src;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = {9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        long befor = System.currentTimeMillis();
        sort(a);
        print(a);
        System.out.println();
        long after = System.currentTimeMillis();
        System.out.println((after-befor));
    }
    static void sort(int[] a){
        int h = 1;
        while(h<=a.length/3){
            h = h*3+1;
        }
        //for(int gap = h ;gap>0;gap = (gap-1)/3){
        for(int gap = a.length/2 ;gap>0;gap /= 2){
            for (int i = gap; i <a.length ; i++) {
                for (int j = i; j > gap-1 ; j--) {
                    if (a[j]<a[j-gap]){
                        swap(a,j,j-gap);
                    }
                }
            }
        }

    }
    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void print(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
