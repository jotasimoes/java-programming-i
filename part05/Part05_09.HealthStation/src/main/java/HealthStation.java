
public class HealthStation {
    
    private int weighinsCount;


    public int weigh(Person person) {
       weighinsCount++;
        return person.getWeight();
        
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings(){
        return weighinsCount;
    }

}
