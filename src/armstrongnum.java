import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        arm();
    }
    static void arm(){
        int x = 100;
        while( x > 0 ){
            int rem = x%10;
            int cube = rem*rem*rem;
            int sum = 0;
            sum+=cube;
            x = x/10;
        if(sum==x){
            System.out.println(x);
        }
        x++;
        }
    }
}
