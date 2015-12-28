package co.thegiven.tester.Objects;

import java.util.ArrayList;

/**
 * Created by danielkim on 11/25/15.
 */
public class Rooms {

    private String creatorid;

    private String title;

    private String description;

    private int vote;

    private int roomid;

    private ArrayList<Comment> comments;

    private Location location;

    public Rooms(String creator, String title, String description, int vote, int roomid, double longitude, double latitude) {
        this.creatorid = creator;
        this.title = title;
        this.description = description;
        this.vote = vote;
        this.roomid = roomid;
        this.location = new Location(longitude, latitude);
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public Location getLocation() {
        return this.location;
    }

}
