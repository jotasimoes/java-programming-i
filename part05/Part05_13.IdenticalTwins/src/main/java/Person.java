
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals(Object personCompared){
        if(this==personCompared){
            return true;
        }
        
        if (!(personCompared instanceof Person)) {
            return false;
        }
        
        
        Person personCasted = (Person) personCompared;
        
        if(this.name.equals(personCasted.name)&
           this.birthday.equals(personCasted.birthday)&
           this.height==personCasted.height &
           this.weight==personCasted.weight)
                                                {
            return true;
        }
        else{
            return false;
        }
    }
}
