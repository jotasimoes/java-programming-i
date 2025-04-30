/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class Item {
    
    private String id;
    private String name;
    
    public Item(String idCons, String nameCons){
        this.id=idCons;
        this.name=nameCons;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setName(String name){
         this.name=name;
    }
    
    public String toString(){
        return this.id+": "+this.name;
    }
    
    public boolean equals(Object comparedItem){
        if(this==comparedItem){
            return true;
        }
        
        if(!(comparedItem instanceof Item)){
            return false;
        }
        
        Item convertedItem = (Item) comparedItem;
        
        if(this.id.equals(convertedItem.id)){
            return true;
        }else{
            return false;
        }
        
    }
    
    
}
