import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int a2 = in.nextInt();
        System.out.print("Enter the operation to be performed ( + , - , * , / ) : ");
        char op = in.next().trim().charAt(0);
        float ans = 0;
        if(op == '+'){
            ans = a1 + a2;
            System.out.println("The sum is : " + ans);
        } else if (op == '-') {
            ans = a1 - a2;
            System.out.println("The difference is : " + ans);
        } else if (op == '*') {
            ans = a1 * a2;
            System.out.println("The product is : " + ans);
        } else if (op == '/') {
            ans = a1 / a2;
            System.out.println("The reminder is : " + ans);
        }else {
            System.out.println("Invalid operator!!");
        }

    }
}
