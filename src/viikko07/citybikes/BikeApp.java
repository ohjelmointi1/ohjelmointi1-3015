package viikko07.citybikes;

import java.util.ArrayList;
import java.util.List;

/**
 * Tämä tuntiesimerkki hyödyntää "Helsingin ja Espoon kaupunkipyörillä ajetut
 * matkat" -tietoaineistoa, joka on saatavissa osoitteesta:
 * https://www.avoindata.fi/data/fi/dataset/helsingin-ja-espoon-kaupunkipyorilla-ajatut-matkat
 * 
 * Koodin kokeilemiseksi tallenna itsellesi kesä-elokuun 2020 aineisto
 * seuraavista osoitteista:
 * 
 * - https://dev.hsl.fi/citybikes/od-trips-2020/2020-06.csv
 * 
 * - https://dev.hsl.fi/citybikes/od-trips-2020/2020-07.csv
 * 
 * - https://dev.hsl.fi/citybikes/od-trips-2020/2020-08.csv
 *
 * Siirrä CSV-tiedostot Java-projektin juurihakemistoon nimellä
 * kaupunkipyorat-2020-0X.csv (korvaa X kuukauden numerolla)
 * 
 * Datan omistaa City Bike Finland ja sen lisenssi on CC-BY-4.0
 */
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

        System.out.println("Trips in total: " + trips.size());
        System.out.println("Total distance: " + (totalDistance / 1_000) + " km");

        int earthCircumference = 40_075; // km
        System.out.println("Around the world " + (totalDistance / 1_000 / earthCircumference) + " times");
        System.out.println("Longest trip: " + longestTrip);
    }
}
