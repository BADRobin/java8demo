package java8demo;

import java.time.Duration;
import java.time.LocalDate;



public class AirFlight implements Flight {
    private String code;
    private String destination;
    private LocalDate date;
    private Integer numPassengers;
    private Integer numSeats;
    private Duration duration;
    private Double price;

    public AirFlight(String code, String destination, LocalDate date, Integer numPassengers, Integer numSeats, Duration duration, Double price) {
        this.code = code;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.numSeats = numSeats;
        this.duration = duration;
        this.price = price;
    }

    public AirFlight(String s) {
        code = s;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Integer getNumPassengers() {
        return numPassengers;
    }

    @Override
    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public Integer getNumSeats() {
        System.out.println("+");
        return numSeats;
    }

    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    @Override
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public Double getPrice() {
        System.out.print("*");
        return price;
    }

    @Override
    public Double getOccupation() {
        return 1.0 * numPassengers / numSeats;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Flight o) {
        return code.compareTo(o.getCode());
    }

    @Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", numPassengers=" + numPassengers +
                ", numSeats=" + numSeats +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}