package viikko07.citybikes;

import java.util.ArrayList;
import java.util.List;

public class BikeApp {

    public static void main(String[] args) {
        TripFileReader fileReader = new TripFileReader();
        List<BikeTrip> trips = new ArrayList<>();

        List<BikeTrip> tripsJune = fileReader.readFile("kaupunkipyorat-2020-06.csv");
        List<BikeTrip> tripsJuly = fileReader.readFile("kaupunkipyorat-2020-07.csv");
        List<BikeTrip> tripsAugust = fileReader.readFile("kaupunkipyorat-2020-08.csv");

        trips.addAll(tripsJune);
        trips.addAll(tripsJuly);
        trips.addAll(tripsAugust);

        BikeTrip longestTrip = trips.get(0);
        double totalDistance = 0;

        for (BikeTrip trip : trips) {
            totalDistance += trip.getDistance();
            if (trip.getDistance() > longestTrip.getDistance()) {
                longestTrip = trip;
            }
        }

        System.out.println("Total distance: " + (totalDistance / 1_000) + " km");
        System.out.println("Longest trip: " + longestTrip);
    }
}
