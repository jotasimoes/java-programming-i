
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Where to?");
        int number = Integer.valueOf(s.nextInt());
        System.out.println("Where from?");
        int i=Integer.valueOf(s.nextInt());
        
        while(i<=number){
            System.out.println(i);
            i++;
        }
        
    }
}
