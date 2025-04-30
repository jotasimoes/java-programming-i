
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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight=maxWeight;
        this.suitcases=new ArrayList<Suitcase>();
    }
    
   public int totalWeight(){
       int totalWeight=0;
       for(Suitcase suitcase:suitcases){
           totalWeight=totalWeight+suitcase.totalWeight();
       }
       return totalWeight;
   }
   
   public void addSuitcase(Suitcase suitcase){
      if(this.totalWeight()+suitcase.totalWeight()<=this.maxWeight){
          this.suitcases.add(suitcase);
      } 
   }
   
   public void printItems(){
      
       
       for(Suitcase suitcase:suitcases){
           suitcase.printItems();
       }
   }
   
   public String toString(){      
       return suitcases.size()+" suitcases ("+this.totalWeight()+" kg)";
   }
    
    
    
}
