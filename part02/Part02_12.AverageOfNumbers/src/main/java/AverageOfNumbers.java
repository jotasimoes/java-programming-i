
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int soma = 0;
        int count = 0;

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
        double media = soma*1.0 / count ;
        System.out.println("Average of the numbers: " + media);

    }
}
