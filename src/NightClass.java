public class NightClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        int ans = binary(arr, target);
        System.out.println(ans);
    }

    static int linear(int[] arr, int target) {
        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        for(int i=0;i<end;i++){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target < arr[mid]) {
                start = mid -1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }

}
