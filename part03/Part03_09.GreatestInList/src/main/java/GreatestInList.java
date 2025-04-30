
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int maior=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        for(int i=0;i<list.size();i++){
          
          if(list.get(i)>maior){
              maior=list.get(i);
          }
        }
        
        System.out.println("The greatest number: "+maior);

        // implement finding the greatest number in the list here
    }
}
