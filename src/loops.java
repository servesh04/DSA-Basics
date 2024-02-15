import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for loop
        int n1 = input.nextInt();
        //for(int i=1;i<=n1;i+=1){
        //    System.out.println(i);
        //}
        //while loop
//        int j=1;
//        while(j<=n1){
//            System.out.println(j);
//            j+=1;
//        }
        // do while loop
        int q=1;
        do {
            System.out.println(q);
            q+=1;
        }while (q<=n1);
    }
}

