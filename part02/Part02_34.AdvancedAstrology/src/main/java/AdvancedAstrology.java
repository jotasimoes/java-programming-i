
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }

    }

    public static void printTriangle(int size) {

        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);

        }

    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            // Print spaces for the triangle (height - i)
            printSpaces(height - i);
            // Print stars for the triangle (2 * i - 1)
            printStars(2 * i - 1);
            // Move to the next line
           
        }

        // Printing the base of the tree (two rows, 3 stars wide)
        for (int i = 0; i < 2; i++) {
            // Print spaces to center the base (height - 2)
            printSpaces(height - 2);
            // Print 3 stars for the base
            printStars(3);
            // Move to the next line
            
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
