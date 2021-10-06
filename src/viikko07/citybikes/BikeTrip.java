package viikko07.citybikes;

import java.time.LocalDateTime;

//﻿Departure,Return,Departure station id,Departure station name,Return station id,Return station name,Covered distance (m),Duration (sec.)
//2020-07-31T23:59:57,2020-08-01T00:17:28,137,Arabian kauppakeskus,116,Linnanmäki,2411,1048
public class BikeTrip {

    private LocalDateTime departureTime;
    private LocalDateTime returnTime;
    private String departureStation;
    private String returnStation;
    private double distance;
    private int duration;

    public BikeTrip(LocalDateTime depTime, LocalDateTime retTime, String depStation, String retStation, double distance,
            int duration) {
        this.departureTime = depTime;
        this.returnTime = retTime;
        this.departureStation = depStation;
        this.returnStation = retStation;
        this.distance = distance;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public double getDistance() {
        return this.distance;
    }

    public double calculateAverageSpeed() {
        if (this.duration == 0) {
            return 0;
        } else {
            return this.distance / this.duration;
        }
    }

    @Override
    public String toString() {
        return "Bike trip from " + this.departureStation + " to " + this.returnStation + " on " + this.departureTime
                + ". Distance: " + (this.distance / 1_000) + " km, duration: " + (this.duration / 60.0) + " minutes";
    }
}
