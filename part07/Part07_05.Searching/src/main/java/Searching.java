
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
    for (int i = 0; i < books.size(); i++) {
        if (books.get(i).getId() == searchedId) {
            return i; // Retorna o índice assim que encontrar
        }
    }
    return -1; // Retorna -1 se não encontrar o livro
}


    public static int binarySearch(ArrayList<Book> books, long searchedId) {
       
       
       int inicio=0;
       int fim=books.size()-1;
       
       while(inicio<=fim){
           int meio=(fim+inicio)/2;
           if(books.get(meio).getId()== searchedId){
               return meio;
           }
           if(books.get(meio).getId()<searchedId){
               inicio=meio+1;
           }
           
           if(books.get(meio).getId()>searchedId){
               fim=meio-1;
           }
           
       }
        return -1;
    }
}

