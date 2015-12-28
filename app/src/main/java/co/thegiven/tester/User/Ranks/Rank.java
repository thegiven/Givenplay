package co.thegiven.tester.User.Ranks;

/**
 * Created by danielkim on 12/15/15.
 */
public class Rank implements Comparable {

    private double quality;

    public Rank(double quality) {
        this.quality = quality;
    }

    public int compareTo(Object ranking) {
        if (ranking instanceof Rank) {
            if (this.quality > ((Rank) ranking).quality) {
                return 1;
            } else if (this.quality < ((Rank) ranking).quality) {
                return -1;
            } else {
                return 0;
            }
        } return -2;
    }

    public double changeRate(double factor) {
        return 0;
    }
}
