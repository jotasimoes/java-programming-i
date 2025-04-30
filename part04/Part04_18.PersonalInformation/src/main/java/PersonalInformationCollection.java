
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("First name: ");
            String firstName=sc.nextLine();
            
            if(firstName.isEmpty()){
                break;
            }
            
            System.out.println("Last name: ");
            String lastName=sc.nextLine();
            
            System.out.println("Identification number: ");
            String id=sc.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName,lastName,id));
            
        }
        
        for(PersonalInformation personalInfo:infoCollection){
            System.out.println(personalInfo.getFirstName()+" "+personalInfo.getLastName());
        }
        
        

    }
}
