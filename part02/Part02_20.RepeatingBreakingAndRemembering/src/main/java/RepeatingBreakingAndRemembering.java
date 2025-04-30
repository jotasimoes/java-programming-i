
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int soma = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(s.nextInt());

            if (number == -1) {
                break;
            } else {
                soma = soma + number;
                count++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }
        }
        double media = soma * 1.0 / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + soma);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + media);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
