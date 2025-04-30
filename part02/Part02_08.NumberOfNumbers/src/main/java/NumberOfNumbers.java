
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputs = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(s.nextLine());
            
            if(number == 0){
                break;
            } else{
                inputs=inputs+1;
            }            
            
        }
        System.out.println("Number of numbers: "+inputs);

    }
}
