
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> datalist = new ArrayList<>(); 
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                datalist.add(line);
            }
            
            
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
        

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
       if(datalist.contains(searchedFor)){
           System.out.println("Found!");
       }else{
           System.out.println("Not found.");
       }

    }
}
