import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        //sum();
        //int mul = multiply(3,5);
        //System.out.println(mul);
        //String greetings = greet("Servesh");
        //System.out.println(greetings);
        swap(5,6);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " " + b);
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter a number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum of the numbers is: " + sum);
    }
    static int multiply(int a, int b){
        int n = a * b;
        return n;
    }
    static String greet(String name){
        String message = "Hi " + name;
        return message;
    }
}
