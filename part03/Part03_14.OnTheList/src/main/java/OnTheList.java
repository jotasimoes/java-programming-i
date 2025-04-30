
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        
        
        /*for(int i=0;i<list.size();i++){
            
            if(input==list.get(i)){
                System.out.println(input+" was found!");
            }
        }
*/
        boolean found=false;
        System.out.println("Search for? ");       
        String input = scanner.nextLine();
        
        for(String name:list){
           
           
           if(input.equals(name)){
               found=true;
           }
        }
        
        if(found==true){
            System.out.println(input+" was found!");
        }
        else{
            System.out.println(input+" was not found!");
        }
       
            
        
    }
}
