import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int a){
        if(a<=1){
            return false;
        }
        int c = 2;
        if(c * c <= a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c * c > a;
    }
}
