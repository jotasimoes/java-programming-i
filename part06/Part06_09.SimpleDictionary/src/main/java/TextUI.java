
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class TextUI {
    
    private Scanner sc;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner sc, SimpleDictionary dictionary){
        this.sc=sc;
        this.dictionary=dictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = sc.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(command.equals("add")){
                
                System.out.println("Word: ");
                String word = sc.nextLine();
                
                System.out.println("Translation: ");
                String translation = sc.nextLine();
                
                dictionary.add(word, translation);
            }
            
            else if(command.equals("search")){
                System.out.println("To be translated: ");
                String wordToBeTranslated = sc.nextLine();
                
                if(this.dictionary.translate(wordToBeTranslated)==null){
                    System.out.println("Word "+wordToBeTranslated+" was not found");
                  break;
                }
                
                System.out.println("Translation: "+this.dictionary.translate(wordToBeTranslated));
                
                
            }
            else{
                System.out.println("Unknown command");
            }
            
            
        }
        
        
        
        
    }
    
}
