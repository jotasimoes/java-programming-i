
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number=Integer.valueOf(s.nextInt());
        
        int i=0;
        while(i<=number){
            System.out.println(i);
            i++;
        }

    }
}
