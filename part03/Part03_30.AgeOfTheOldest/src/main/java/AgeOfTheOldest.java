
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);

int count = 0;
int oldestage=0;
while (true) {
    String input = reader.nextLine();
    if (input.equals("")) {
        break;
    }

    String[] parts = input.split(",");
    if(Integer.valueOf(parts[1])>oldestage){
        oldestage=Integer.valueOf(parts[1]);
    }
    count = count + 1;
    
}
        System.out.println("Age of the oldest: "+oldestage);


    }
}
