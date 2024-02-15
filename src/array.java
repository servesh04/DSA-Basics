import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(10);
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the no of inputs:");
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            int k = in.nextInt();
//            list.add(k);
//        }
//        System.out.println(list);
        int[] arr = {1,2,3,4,5};
        reverse(arr);
//        swap(arr,1,2);
//        maxofarr(arr);
    }
    static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
    static void maxofarr(int[] arr){
        int max=0;
        for (int i = 0; i <= arr.length-1; i++) {
            if(max<i){
                max=arr[i];
            }
        }
        System.out.println("Maximum is : "+max);
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start , end);
            start++;
            end--;
        }
    }
}
