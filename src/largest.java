import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = in.nextInt();
        System.out.print("Enter the 3rd number: ");
        int n3 = in.nextInt();
        if(n1>n2){
            if(n1>n3){
                System.out.println("The largest number is: " + n1);
            }
        } else if (n2>n1) {
            if(n2>n3){
                System.out.println("The largest number is: " + n2);
            }
        }else {
            System.out.println("The largest number is: " + n3);
        }
    }
}
