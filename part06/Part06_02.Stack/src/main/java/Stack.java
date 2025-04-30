
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class Stack {
    
    private ArrayList<String> strings;
    
    public Stack(){
               this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.strings.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        this.strings.add(value);
    }
    
    public ArrayList<String> values(){
        ArrayList<String> listOfStrings = new ArrayList<>();
        
        for(String string:strings){
            listOfStrings.add(string);
        }
        
        return listOfStrings;
    }
    
    
    public String take(){
        String returnedString = this.strings.get(strings.size()-1);
        this.strings.remove(strings.size()-1);
        
        
        return returnedString;
    }
    
    
    
    
    
}
