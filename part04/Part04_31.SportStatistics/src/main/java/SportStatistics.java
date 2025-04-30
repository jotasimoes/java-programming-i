
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Match> matchDataList = new ArrayList<>();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] parts = line.split(",");
                
                String homename=parts[0];
                String awayname=parts[1];
                int homescore=Integer.valueOf(parts[2]);
                int awayscore=Integer.valueOf(parts[3]);
                
                matchDataList.add(new Match(homename,awayname,homescore,awayscore));
                
            }
            
        } catch(Exception e){
            System.out.println("fodeu");
        }
        
        
        System.out.println("Team:");
        String searchTeam = scan.nextLine();
        int games =0;
        int wins=0;
        int losses=0;
        
        for(Match match:matchDataList){
           if (match.getHomeTeam().equals(searchTeam)) {  // Team is home
                games++;
                if (match.getHomeScore() > match.getAwayScore()) {
                    wins++;  // Home win
                } else {
                    losses++;  // Home loss
                }
            } else if (match.getAwayTeam().equals(searchTeam)) {  // Team is away
                games++;
                if (match.getAwayScore() > match.getHomeScore()) {
                    wins++;  // Away win
                } else {
                    losses++;  // Away loss
                }
            }
            
        }
        
        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);

    }

}
