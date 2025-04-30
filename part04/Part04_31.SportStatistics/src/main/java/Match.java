/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class Match {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public Match(String homeTeam,String awayTeam,int homeScore,int awayScore){
        this.homeTeam=homeTeam;
        this.awayTeam=awayTeam;
        this.homeScore=homeScore;
        this.awayScore=awayScore;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getAwayTeam(){
        return this.awayTeam;
    }
    
    public int getHomeScore(){
        return homeScore;
    }
    
     public int getAwayScore(){
        return awayScore;
    }
    
   
    
    
    
}
