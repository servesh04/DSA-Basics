import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max in the array and swap with correct index
            int last = arr.length-i-1;
            int max = maxi(arr , 0 , last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxi(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i] ){
                max = i;
            }
        }
        return max;
    }
}