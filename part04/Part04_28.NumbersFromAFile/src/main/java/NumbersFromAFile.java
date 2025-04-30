
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numeros= new ArrayList<>();
        
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                int numero=Integer.valueOf(sc.nextLine());
                
                if(numero<=upperBound & numero>=lowerBound){
                    numeros.add(numero);
                }
            }
        }catch(Exception e){
            System.out.println("fodeu");
        }
        
        System.out.println("Numbers: "+numeros.size());
        

    }

}
