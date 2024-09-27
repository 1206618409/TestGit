package src;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,1,7,9,4,2};
        for (int i = 1; i <arr.length ; i++) {
            for (int j = arr.length-1;j>=i;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j);

                }
            }
        }
        print(arr);

    }
    static void swap(int[]arr,int x){
        int temp = arr[x];
        arr[x] = arr[x-1];
        arr[x-1] = temp;
    }
    static void print(int[]arr){
        for (int arrs:arr) {
            System.out.print(arrs);
        }
    }
}
