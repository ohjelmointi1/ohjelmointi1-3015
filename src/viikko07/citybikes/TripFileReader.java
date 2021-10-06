package viikko07.citybikes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class TripFileReader {

    public List<BikeTrip> readFile(String filename) {
        List<BikeTrip> trips = new ArrayList<>();
        Path path = Paths.get(filename);

        try {
            List<String> lines = Files.readAllLines(path);
            List<String> data = lines.subList(1, lines.size());

            for (String row : data) {
                try {
                    BikeTrip trip = parseCsvTrip(row);
                    trips.add(trip);

                } catch (NumberFormatException numberException) {
                    System.err.println("Error parsing number: " + numberException.getMessage());
                    System.err.println("Line was: " + row);
                } catch (DateTimeParseException dateException) {
                    System.err.println("Error parsing datetime: " + dateException.getMessage());
                    System.err.println("Line was: " + row);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return trips;
    }

    private BikeTrip parseCsvTrip(String csv) {
        csv = csv.replace("Aalto-yliopisto (M),", "Aalto-yliopisto (M)"); // small "hack" to fix names with commas

        String[] parts = csv.split(",");

        LocalDateTime departureTime = LocalDateTime.parse(parts[0]);
        LocalDateTime returnTime = LocalDateTime.parse(parts[1]);
        String departureStation = parts[3];
        String returnStation = parts[5];
        double distance = Double.parseDouble(parts[6]);
        int duration = Integer.parseInt(parts[7]);

        return new BikeTrip(departureTime, returnTime, departureStation, returnStation, distance, duration);
    }
}
