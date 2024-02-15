import java.util.Arrays;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,10,40};
        int n=arr.length;
        int x=10;
        int result=binary(arr,0,n-1,x);
        if(result==-1){
            System.out.println("Element not found");
        }else {
            System.out.println(result);
        }
        int res = Arrays.binarySearch(arr,x);
        System.out.println(res);
    }
    static int binary(int[] arr, int l , int r, int x){
        while(l<=r){
            int mid = (l+r)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]>x) {
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return -1;
    }
}
