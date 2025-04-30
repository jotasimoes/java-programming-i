
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> lista = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(sc.nextLine());
            lista.add(input);               
            
            if(input==9999){
                break;
            }
        }

        int maispek=lista.get(0);
        for(int i=0;i<lista.size();i++){            
            
            if(lista.get(i)<=maispek){
                maispek=lista.get(i);
                System.out.println("Smallest number: "+maispek);
                System.out.println("Found at index: "+i);
            }
        }        
        
        
      
       
       
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
