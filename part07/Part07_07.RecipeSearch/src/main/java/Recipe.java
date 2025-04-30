
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
public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(){
        this.name="";
        this.cookingTime=0;
        this.ingredients= new ArrayList<String>();
    }
    
    public Recipe(String name, int time,ArrayList<String> ingredients){
        this.name=name;
        this.cookingTime=time;
        this.ingredients= ingredients;
    }
    
    public String getName(){
        return this.name;
    }
    
     public int getTime(){
        return this.cookingTime;
    }
     
     public ArrayList<String> getIngredients(){
         return this.ingredients;
     }
    
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setTime(int time){
        this.cookingTime=time;
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public String toString(){
        return this.name+", cooking time: "+this.cookingTime;
    }
    
    
    
    
}
