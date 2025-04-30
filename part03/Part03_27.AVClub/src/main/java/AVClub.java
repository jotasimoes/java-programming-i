
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input=scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
            String[] palavras = input.split(" ");
            
            for(String palavra:palavras){
                if(palavra.contains("av")){
                    System.out.println(palavra);
                }
            }
            
        }

    }
}
