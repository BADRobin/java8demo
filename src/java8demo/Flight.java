package java8demo;

import java.time.Duration;
import java.time.LocalDate;

public interface Flight extends Comparable<Flight>{
    public static Flight nullFlight(){
        return new AirFlight("000");
    }
    String getCode();
    String getDestination();
    LocalDate getDate();
    Integer getNumPassengers();
    Integer getNumSeats();
    Duration getDuration();
    Double getPrice();
    Double getOccupation();
    void setPrice(Double p);
    void setDuration(Duration d);
    void setNumPassengers(Integer np);

}
