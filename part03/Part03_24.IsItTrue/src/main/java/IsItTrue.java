
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringteste="true";
        
        System.out.println("Give a string: ");
        String input=scanner.nextLine();
        
        if(input.equals(stringteste)){
            System.out.println("You got it right!");
        }
        else{
            System.out.println("Try again!");
        }

    }
}
