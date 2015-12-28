package co.thegiven.tester.User;

import co.thegiven.tester.User.Ranks.Rank;

/**
 * Created by danielkim on 12/15/15.
 * This user class should be a singleton. Only one user gets created.
 *
 * TODO: refactor code to make User a singleton.
 */
public class User {

    private String username;

    private Rank myRank;

    public User(String username, Rank rank) {
        this.username = username;
        this.myRank = rank;
    }

    public String getUsername() {
        return this.username;
    }

    public Rank getRank() {
        return this.myRank;
    }


}
