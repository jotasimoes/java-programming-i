
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int countneg = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(s.nextInt());

            if (number < 0) {
                countneg++;
            } else if (number == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + countneg);
    }
}
