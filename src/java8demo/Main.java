package java8demo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    List<Flight> flights = new ArrayList<>();

    public static void main(String[] args) {
	new Main().run();

    }
    private void run (){

        flights.add(new AirFlight("111", "Odessa", LocalDate.of(2018, 8, 6), 100, 200, Duration.ofHours(2), 200.0));
        flights.add(new AirFlight("123", "kyiv", LocalDate.of(2018, 9, 1), 130, 200, Duration.ofHours(1), 300.0));
        flights.add(new AirFlight("211", "Lyblyana", LocalDate.of(2018, 7, 11), 200, 200, Duration.ofHours(4), 100.0));
        flights.add(new AirFlight("222", "Mykolaiv", LocalDate.of(2018, 12, 21), 190, 300, Duration.ofHours(20), 100.0));
        flights.add(new AirFlight("333", "Odessa", LocalDate.of(2018, 8, 16), 100, 100, Duration.ofHours(2), 200.0));

        flights.stream().forEach(System.out::println);
        System.out.println("---------------------------------");
        Stream<Flight> stream = flights.stream().filter(f -> f.getPrice() < 200).filter(f -> f.getNumSeats() < 250);
        System.out.println("-----Test-----");
        System.out.println(stream.count());
        System.out.println("_______________________");
        flights.stream().filter(f -> f.getDate().isAfter(LocalDate.of(2018, 8,6)) ).forEach(System.out::println);
        System.out.println("------------------");
        System.out.println(getFlightHigherOccupation(LocalDate.now().plusDays(1)));

        System.out.println(totalDuration());
        System.out.println("-----------------");
//        List<String> dest = getDest;
//                .map(Flight::getDestination)
//                .collect(Collectors.toList());
    }


    private Duration totalDuration(){
        return flights.stream()
                .map(Flight::getDuration)
                .reduce(Duration.ZERO, Duration::plus);
    }
    public Flight getFlightHigherOccupation(LocalDate f) {
        Optional<Flight> max = flights.stream()
                .filter(x -> x.getDate().equals(f))
                .max(Comparator.comparingDouble(Flight::getOccupation));
        return max.orElseGet(Flight::nullFlight);

    }
}
