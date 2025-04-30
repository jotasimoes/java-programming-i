
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
      

         Scanner reader = new Scanner(System.in);

int count = 0;
String oldestname = null;
int oldestage=0;
while (true) {
    String input = reader.nextLine();
    if (input.equals("")) {
        break;
    }

    String[] parts = input.split(",");
    if(Integer.valueOf(parts[1])>oldestage){
        oldestname=parts[0];
        oldestage=Integer.valueOf(parts[1]);
    }
    count = count + 1;
    
}
        System.out.println("Name of the oldest: "+oldestname);

    }
}
