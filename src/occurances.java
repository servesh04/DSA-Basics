import java.util.Scanner;
public class occurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the number to find the occurances: ");
        int i = in.nextInt();
        int count = 0;
        while(n > 0){
            int temp = n;
            int rem = n % 10;
            if(rem == i){
                count++;
            }
            n = n/10;
        }
        System.out.println("The no of instances is: " + count);
    }
}
