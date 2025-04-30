
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> listOfItems = new ArrayList<>();


        while(true){
            System.out.println("Identifier? (empty will stop)");            
            String inputId = scanner.nextLine();
            
            if (inputId.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();
            
             if (inputName.isEmpty()) {
                break;
            }
             
             Item newItem = new Item(inputId,inputName);    
             
             if(listOfItems.contains(newItem)){
                 
             }else{
                  listOfItems.add(newItem);
             }
             
            
            
        }
        
        System.out.println("==Items==");
        for(Item items:listOfItems){
            
            System.out.println(items.toString());
        }
       
        
        
        
    }
}
