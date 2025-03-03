
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scanner.nextLine();
        
        ArrayList<Match> matches = new ArrayList<>(); 
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                String[] parts = line.split(",");
                int homeTeamPoint = Integer.valueOf(parts[2]);
                int visitingTeamPoint = Integer.valueOf(parts[3]);
                matches.add(new Match(parts[0], parts[1], homeTeamPoint, visitingTeamPoint));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String teamName = scanner.nextLine();
        
        int countTotal = 0;
        int countWin = 0;
        int countLose = 0;
        
        for (Match match : matches) {
            if ((match.getHomeTeam()).equals(teamName) || (match.getVisitingTeam()).equals(teamName)) {
                countTotal++;
                if (match.isWin(teamName)) {
                    countWin++;
                } else {
                    countLose++;
                }
            }          
        }
        
        
        System.out.println("Games: " + countTotal);
        System.out.println("Wins: " + countWin);
        System.out.println("Losses: " + countLose);
    }

}
