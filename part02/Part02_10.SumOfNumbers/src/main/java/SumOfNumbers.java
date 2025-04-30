
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        while (true) {

            System.out.println("Give a number:");
            int number = Integer.valueOf(s.nextInt());

            if (number == 0) {
                break;
            } else {
                soma = soma + number;
            }
        }
        System.out.println("Sum of the numbers: " + soma);

    }
}
