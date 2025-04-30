
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object comparedBook){
        if(this==comparedBook){
           return true; 
        }
        
        if(!(comparedBook instanceof Book)){
            return false;
        }
        
        Book castedBook = (Book) comparedBook;
        
        if(this.name.equals(castedBook.name)& this.publicationYear==castedBook.publicationYear){
            return true;
        }else{
            return false;
        }
        
        
    }

}
