package src;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,1,7,9,4,2};
        for (int i = 0; i <arr.length-1; i++) {
            int min =i;
            for (int j = i+1; j <arr.length;j++) {
                ;
                /*if (arr[j]<arr[min]){
                    min = j;
                }*/
                min = arr[j]<arr[min] ? j:min;

            }
            System.out.println("min:"+min);
            swap(arr,i,min);
            System.out.println("经过第"+i+"次循环之后，数组的内容：");
            print(arr);
        }
    }
    static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
