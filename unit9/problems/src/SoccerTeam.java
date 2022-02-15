public class SoccerTeam {
    private int wins, losses, ties;
    private static int totalPlayed, totalGoals;
    // no constructor needed because all values initialize to 0

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore > otherScore) {
            wins++;
            other.losses++;
        }
        else if (myScore == otherScore) {
            ties++;
            other.ties++;
        }
        else {
            losses++;
            other.wins++;
        }
        totalPlayed++;
        totalGoals += myScore + otherScore;
    }
    public void reset() {
        wins= 0;
        losses = 0;
        ties = 0;
    }
    public int getPoints() {
        return wins*3 + ties;
    }
    public static int getTotalPlayed() {
        return totalPlayed;
    }
    public static int getTotalGoals() {
        return totalGoals;
    }
    public static void startTournament() {
        totalPlayed =0;
        totalGoals = 0;
    }
    public static void main(String[] args) {
        SoccerTeam[] tourney1 = new SoccerTeam[4];
        for (int i =0; i<4; i++) {
            tourney1[i] = new SoccerTeam();
        }

        startTournament();
        System.out.println("Tournament 1 Started");
        for(int j = 0; j< 4; j+=2) {
            for (int k = 3; k >= 0; k--) {
                tourney1[j].played(tourney1[k], (int) (Math.random() * 4), (int) (Math.random() * 4));
            }
        }
        for (int j = 0; j< 4; j++) {
            System.out.println("Team " + j + ": " + tourney1[j].getPoints() + " points");
            tourney1[j].reset();
        }
        System.out.println("Total goals: " + SoccerTeam.getTotalGoals());
        System.out.println("Total games played: " + SoccerTeam.getTotalPlayed());
        System.out.println("Tournament Ended. \n");

        SoccerTeam[] tourney2 = new SoccerTeam[4];
        for (int i =0; i<4; i++) {
            tourney2[i] = new SoccerTeam();
        }
        startTournament();
        System.out.println("Tournament 2 Started");
        for(int j = 0; j< 4; j+=2) {
            for (int k = 3; k >= 0; k--) {
                tourney2[j].played(tourney2[k], (int) (Math.random() * 4), (int) (Math.random() * 4));
            }
        }
        for (int j = 0; j< 4; j++) {
            System.out.println("Team " + j + ": " + tourney2[j].getPoints() + " points");
            tourney2[j].reset();
        }
        System.out.println("Total goals: " + SoccerTeam.getTotalGoals());
        System.out.println("Total games played: " + SoccerTeam.getTotalPlayed());
        System.out.println("Tournament Ended. \n");

    }
}
