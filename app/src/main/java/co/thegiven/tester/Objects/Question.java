package co.thegiven.tester.Objects;

/**
 * Created by danielkim on 11/10/15.
 */
public class Question {
    private String title;

    private String description;

    private String authorid;

    public Question(String title, String description, String id) {
        this.title = title;
        this.description = description;
        this.authorid = id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

}
