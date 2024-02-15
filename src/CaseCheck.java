import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = in.next().trim().charAt(0);
        if (c>='A' && c<='Z'){
            System.out.println("It is a uppercase character");
        }else {
            System.out.println("It is a lowercase character");
        }
    }
}
