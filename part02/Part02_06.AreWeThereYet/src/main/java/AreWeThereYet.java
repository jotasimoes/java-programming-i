
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(s.nextLine());
            
            if(number==4){
                break;
            }
        }
    }
}
