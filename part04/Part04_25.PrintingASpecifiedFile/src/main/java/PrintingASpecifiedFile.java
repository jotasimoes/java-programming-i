
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Which file should have its contents printed?");
        String whichFile=sc.nextLine();
        
        
        try( Scanner sc2 = new Scanner(Paths.get(whichFile));){
           while(sc2.hasNextLine()){
               String line= sc2.nextLine();
               System.out.println(line);
           }
            
            
            
        }catch(Exception e){
            
        }
        

    }
}
