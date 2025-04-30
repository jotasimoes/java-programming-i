
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
public class Statistic {
    
    private ArrayList<Integer> points;
    
    
    public Statistic(){
        this.points= new ArrayList<Integer>();
    }
    
    public void addPoint(int point){
        points.add(point);
    }
    
    public double average(){
        int sum=0;
        for(int i=0;i<points.size();i++){
            sum=sum+points.get(i);
        }
        return (1.0*sum)/(1.0*points.size());
    }
    
    public String averagePassing(){
        int sum=0;
        int countPassing=0;
        for(int i=0;i<points.size();i++){
            if(points.get(i)>=50){
                sum=sum+points.get(i);
                countPassing++;
            }
        }
        if(sum==0){
            return "-";
        }
        return String.valueOf((1.0*sum)/(1.0*countPassing));
        
       
    }
    
    public double passPercentage(){
          int sum=0;
        int countPassing=0;
        for(int i=0;i<points.size();i++){
            if(points.get(i)>=50){
                sum=sum+points.get(i);
                countPassing++;
            }
        }
        
        return 100*countPassing*1.0/points.size();
    }
    
    public void gradeDistribution(){
        int[] grades = new int[6];
        
        
        for(int i=0;i<points.size();i++){
            int point = points.get(i);
            if(point<50){
                grades[0]++;
            }
            else if(point<60){
                grades[1]++;
            }
            else if(point<70){
                grades[2]++;
            }
            else if(point<80){
                grades[3]++;
            }
            else if(point<90){
                grades[4]++;
            }
            else{
                grades[5]++;
            }
        }
        
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
   
    
    
    
    
    
}
