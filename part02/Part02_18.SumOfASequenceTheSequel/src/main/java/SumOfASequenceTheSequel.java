
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.valueOf(s.nextInt());
        System.out.println("Last number?");
        int last = Integer.valueOf(s.nextInt());
        int soma = 0;

        while (first <= last) {
            soma = soma + first;
            first++;
        }
        System.out.println("The sum is " + soma);
    }
}
