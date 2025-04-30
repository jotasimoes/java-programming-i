
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Last number?");
        int last = Integer.valueOf(s.nextInt());
        int soma=0;
        
        for(int i=1;i<=last ;i++){
            soma=soma+i;            
        }
        System.out.println("The sum is "+soma);

    }
}
