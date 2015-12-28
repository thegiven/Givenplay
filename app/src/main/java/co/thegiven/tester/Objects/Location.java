package co.thegiven.tester.Objects;

/**
 * Created by danielkim on 12/15/15.
 */
public class Location {

    private double longitude;

    private double latitude;

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double findDistance(Location location) {
        double dx = location.getLatitude() - this.latitude;
        double dy = location.getLongitude() - this.longitude;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
