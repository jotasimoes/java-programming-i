
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        while(true){
            System.out.println("Shall we carry on?");
            String input = s.nextLine();
            
            if(input.equals("no")){
                break;
            }
        }
    }
}
