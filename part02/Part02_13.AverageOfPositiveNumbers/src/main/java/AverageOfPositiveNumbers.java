
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = 0;
        int soma = 0;

        while (true) {
            int number = Integer.valueOf(s.nextInt());

            if (number == 0) {
                break;
            }
            if (number > 0) {
                count++;
                soma = soma + number;
            }
        }

        if(count==0){
            System.out.println("Cannot calculate the average");
        }else{
            double media=soma*1.0/count;
            System.out.println(+media);
        }
    }
}
