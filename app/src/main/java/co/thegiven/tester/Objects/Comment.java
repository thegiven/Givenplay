package co.thegiven.tester.Objects;

import java.util.Date;

/**
 * Created by danielkim on 12/15/15.
 */
public class Comment {

    private String comment;

    private String username;

    private Date time;

    public Comment(String comment, String username) {
        this.comment = comment;
        this.username = username;
        this.time = new Date();
    }
}
