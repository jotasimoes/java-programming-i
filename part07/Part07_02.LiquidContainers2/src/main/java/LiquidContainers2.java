import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length < 2) {
                System.out.println("Invalid input. Please enter a command and an amount.");
                continue;
            }

            String command = parts[0];
            int amount;

            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid amount.");
                continue;
            }

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                int actualMove = Math.min(first.contains(), amount);
                first.remove(actualMove);
                second.add(actualMove);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
