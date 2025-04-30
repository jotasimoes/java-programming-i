
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = 0;
        int soma = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(s.nextInt());

            if (number == 0) {
                break;
            } else {
                soma = soma + number;
                count++;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + soma);

    }
}
