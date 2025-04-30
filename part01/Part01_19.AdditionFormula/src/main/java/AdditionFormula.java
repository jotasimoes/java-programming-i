
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        

         Scanner sc = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(sc.nextLine());
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(sc.nextLine());
        
        int sum = first+second;
        
        System.out.println(first +" + "+second+" = "+sum);

    }
}
