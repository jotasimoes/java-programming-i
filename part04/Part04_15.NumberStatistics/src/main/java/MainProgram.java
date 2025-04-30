
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
     
        
        
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();
        
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers:");
       
       
         
        while(true){
              int input = sc.nextInt();
            if(input==-1){
                break;
            }
            else{
                statistics1.addNumber(input);
                if(input%2==0){
                    statistics2.addNumber(input);
                }else{
                    statistics3.addNumber(input);
                }
                
                
            }
           
        }
        
        System.out.println("Sum: "+statistics1.sum());
        System.out.println("Sum of even numbers: "+statistics2.sum());
        System.out.println("Sum of odd numbers: "+statistics3.sum());
        
        
        
        
    }
}
