/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Match {
     private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoint;
    private int visitingTeamPoint;
    
    public Match(String homeTeam, String visitingTeam, int homeTeamPoint, int visitingTeamPoint) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoint = homeTeamPoint;
        this.visitingTeamPoint = visitingTeamPoint;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public int getHomeTeamPoint() {
        return this.homeTeamPoint;
    }
    
    public int getVisitingTeamPoint() {
        return this.visitingTeamPoint;
    }
    
    public boolean isWin(String teamName) {
        if ((this.homeTeam.equals(teamName) && this.homeTeamPoint > this.visitingTeamPoint) ||
                (this.visitingTeam.equals(teamName) && this.visitingTeamPoint > this.homeTeamPoint)) {
            return true;
        }
        return false;
    }
}
