
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(s.nextInt());
        int fatorial = 1;
        int i = 1;
        while (i <= number) {
            fatorial = fatorial * i;
            i++;
        }

        System.out.println("Factorial: " + fatorial);
    }
}
