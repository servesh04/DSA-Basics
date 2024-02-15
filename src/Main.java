import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name ? :");
        String name = scanner.nextLine();
        System.out.println("Hi " + name +" How are You");
        System.out.println("What is your age");
        int age= scanner.nextInt();
        System.out.print(age +" is a nice age to start programming");
        scanner.close();
    }
}