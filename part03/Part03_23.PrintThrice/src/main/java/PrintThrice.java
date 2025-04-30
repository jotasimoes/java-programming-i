
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int count=0;
       
       
       
       System.out.println("Give a word: ");
       String palavra=scanner.nextLine();
       
       while(count<3){
           System.out.print(palavra);
           count++;
       }

    }
}
