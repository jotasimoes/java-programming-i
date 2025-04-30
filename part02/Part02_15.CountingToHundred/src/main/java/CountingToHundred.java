
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = Integer.valueOf(s.nextInt());

        while (number <= 100) {
            System.out.println(number);
            number++;
        }

    }
}
