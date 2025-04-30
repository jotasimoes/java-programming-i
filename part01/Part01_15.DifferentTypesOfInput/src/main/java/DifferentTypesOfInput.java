
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");     
        String usertext = scan.nextLine();
        
        System.out.println("Give an integer:");
        int userinteger = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double userdouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean userboolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string "+usertext);
        System.out.println("You gave the integer "+userinteger);
        System.out.println("You gave the double "+userdouble);
        System.out.println("You gave the boolean "+userboolean);
        
    }
}
