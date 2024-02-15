import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        switch (fruit) {                         **enhanced switch**
//            case "mango" -> System.out.println("You printed mango");
//            case "apple" -> System.out.println("You printed apple");
//            case "banana" -> System.out.println("You printed banana");
//            default -> System.out.println("Invalid fruit");
//        }
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
