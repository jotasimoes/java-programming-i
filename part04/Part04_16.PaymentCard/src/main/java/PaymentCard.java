/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class PaymentCard {
    
    private double balance;
    
    public  PaymentCard(double initialBalance){
        this.balance=initialBalance;
    }
    
     public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }
    
    public void eatAffordably(){
        if(this.balance-2.60>=0){
           this.balance=this.balance-2.60;
        }
        
    }
    
    public void eatHeartily(){
        if(this.balance-4.60>=0){
           this.balance=this.balance-4.60;
        }
    }
    
    public void addMoney(double ammount){
        if(ammount>0){
            if(this.balance+ammount>150){
            this.balance=150;
        }else{
            this.balance=this.balance+ammount;
        }
        }
        
    }
    
   
    
}
