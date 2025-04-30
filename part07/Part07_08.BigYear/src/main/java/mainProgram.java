
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        
        ArrayList<Bird> birds = new ArrayList<Bird>();
        

        Scanner sc = new Scanner(System.in);
        
        
        
        while(true){
            System.out.println("?");
            String command = sc.nextLine();
            
            if(command.equals("Add")){
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Name in Latin:");
                String latinName = sc.nextLine();
                
                Bird newBird = new Bird(name,latinName);
                birds.add(newBird);
            }
            
            if(command.equals("All")){
                for(Bird bird:birds){
                    System.out.println(bird.toString());
                }
            }  
            
            if(command.equals("One")){
                System.out.println("Bird?");
                String searchedBird= sc.nextLine();
                
               for(Bird bird:birds){
                   if(bird.getName().equals(searchedBird)){
                       System.out.println(bird.toString());
                   }
                }
            }
            
            if(command.equals("Observation")){
                System.out.println("Bird?");
                String searchedBird= sc.nextLine();
                
               for(Bird bird:birds){
                   if(bird.getName().equals(searchedBird)){
                       bird.setObservation();
                   }
                }
            }
            
            if(command.equals("Quit")){
                break;
            }
            
            
            
        }

    }

}
