import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String inputTitle=sc.nextLine();
            
            if(inputTitle.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int inputPages=Integer.valueOf(sc.nextLine());
            
            System.out.println("Publication year: ");
            int inputYear=Integer.valueOf(sc.nextLine());
            
            library.add(new Book(inputTitle,inputPages,inputYear));            
        }
        
        System.out.println("What information will be printed? ");
        String choice = sc.nextLine();
        
        for(Book book:library){
            if(choice.equals("everything")){
                System.out.println(book.toString());               
            }else if(choice.equals("name")){
                System.out.println(book.getTitle());
            }
        }
        
    }
}
