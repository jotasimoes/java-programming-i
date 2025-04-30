
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String printElements = "";

        if (this.elements.size() == 1) {

            printElements = printElements + "The collection " + this.name + " has " + this.elements.size() + " element:";
            for (String element : elements) {
                printElements =  printElements +"\n"+ element ;

            }

        } else if (this.elements.size() > 1) {

            printElements = printElements + "The collection " + this.name + " has " + this.elements.size() + " elements:";
            for (String element : elements) {
                 printElements =  printElements +"\n"+ element ;

            }

        }
        return printElements;
    }

}
