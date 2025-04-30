
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Keep reading input
            String texto = scanner.nextLine(); // Read user input

            if (texto.isEmpty()) { // Stop when input is empty
                break;
            }

            String[] pedacos = texto.split(" "); // Split input by spaces
            
            for (String pedaco : pedacos) { // Print each word on a new line
                System.out.println(pedaco);
            }
        }

        scanner.close(); // Close scanner
    }

       

    }

