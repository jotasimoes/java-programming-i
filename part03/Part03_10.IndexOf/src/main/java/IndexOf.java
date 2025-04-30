
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        int numbersearch=Integer.valueOf(scanner.nextLine());
        int indexfound=0;
        
          for(int i=0;i<list.size();i++){          
          if(list.get(i)==numbersearch){
              indexfound=i;
              System.out.println(+numbersearch+" is at index "+indexfound);
          }
        }
        
        

        
    }
}
