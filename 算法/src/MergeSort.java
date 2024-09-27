package src;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr);

    }
    public static void sort(int[] arr){
        merge(arr);
    }
    static void merge(int[] arr){
        int mid = arr.length /2;
        int[] temp = new int[arr.length];
        int i = 0;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<arr.length){
            temp[k++] = arr[i]<=arr[j] ? arr[i++]:arr[j++];
            /*if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else {
                temp[k] = arr[j];
                j++;
                k++;
            }*/
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<arr.length){
            temp[k++] = arr[j++];
        }
        print(temp);
    }
    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
