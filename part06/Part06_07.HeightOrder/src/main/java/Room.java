
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
public class Room {
    
    private ArrayList<Person> people;
    
    public Room(){
        this.people=new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        if(people.isEmpty()==true){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        
        
        
        Person personReturned=this.people.get(0);
        
        
        for(Person person:this.people){
            if(personReturned.getHeight()>person.getHeight()){
                personReturned=person;
            }
        }
        return personReturned;
    }
    
    
    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }
        
        Person returnedPerson=this.shortest();
        people.remove(this.shortest());
        return returnedPerson;
        
    }
    
}
