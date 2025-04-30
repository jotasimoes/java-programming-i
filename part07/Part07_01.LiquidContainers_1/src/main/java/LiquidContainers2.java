
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class LiquidContainers2 {
     Scanner sc = new Scanner(System.in);
     Container first = new Container();
     Container second = new Container();
     
    
    public void start(){
        while (true) {
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
            
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
