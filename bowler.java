public class bowler {
    // Instance variables
     String name;
     int wickets;
     int matches;
     int ballsBowled;
     int runsConceded;

    // Default constructor
    public bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute Bowling Average
    public void computeBowlingAverage() {
        if (wickets < 0 || runsConceded < 0 || matches < 0 || ballsBowled < 0 || (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
        } else {
            double bowlingAvg = (double) runsConceded / wickets;
            System.out.println("Name: " + name);
            System.out.printf("bowling_avg=%.1f\n", bowlingAvg);
        }
    }

    // Method to show statistics
    public void showStatistics() {
        if (wickets < 0 || runsConceded < 0 || matches < 0 || ballsBowled < 0 || (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
        } else {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + ballsBowled);
            System.out.println("runs_conceded=" + runsConceded);
        }
    }

    // Method to compute Strike Rate
    public void computeStrikeRate() {
        if (wickets < 0 || runsConceded < 0 || matches < 0 || ballsBowled < 0 || (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
        } else {
            double strikeRate = (double) runsConceded / ballsBowled;
            System.out.println("Name: " + name);
            System.out.printf("Strike_rate=%.8f\n", strikeRate);
        }
    }

public static void main(String[] args) {
    // Create an object of Bowler class with the given parameters
    bowler bowler = new bowler("Sachin", 10, 5, 750, 463);

    // Call the methods to test the functionality
    bowler.computeBowlingAverage();
    bowler.showStatistics();
    bowler.computeStrikeRate();
}
}