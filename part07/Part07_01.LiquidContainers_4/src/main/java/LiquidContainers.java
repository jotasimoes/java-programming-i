
import java.util.Scanner;

public class LiquidContainers {
    
    private Scanner sc;
    private Container first;
    private Container second;
    
    public LiquidContainers(){
       this.sc=sc;
       this.first=first;
       this.second=second;
    }

    public  void start() {
         
        while (true) {
            System.out.println(first.toString());
            System.out.println(second.toString());
            
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            
            if (input.equals("quit")) {
                break;
            }
            
            if (command.equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                first.add(amount);
            }
            
            if(command.equals("move")){
                int amount = Integer.valueOf(parts[1]);
                second.add(amount);
                first.remove(amount);
            }
            
             if(command.equals("remove")) {
                 int amount = Integer.valueOf(parts[1]);
                 second.remove(amount);
             }
            
            
            
        }
    }

}
