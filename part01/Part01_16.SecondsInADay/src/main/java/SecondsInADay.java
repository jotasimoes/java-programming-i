
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int dias = Integer.valueOf(sc.nextLine());
        int segundos = 60*60*24*dias;
        
        System.out.println(segundos);

    }
}
