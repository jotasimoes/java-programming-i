
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(sc.nextLine());
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(sc.nextLine());
        
        int sum=first+second;
        int dif=first-second;
        int prod=first*second;
        double quo=(double)first/second;
        
        System.out.println(+first+" + "+second+" = "+sum);
        System.out.println(+first+" - "+second+" = "+dif);
        System.out.println(+first+" * "+second+" = "+prod);
        System.out.println(+first+" / "+second+" = "+quo);

    }
}
