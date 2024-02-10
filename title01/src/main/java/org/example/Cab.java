package org.example;

import java.time.LocalDate;
import java.util.Objects;
//import java.util.Scanner;

public class Cab {
    private String driverName;
    private String passengerName;
    private LocalDate journeyDate;
    private double journeyDistance;
    private double fare;
    private String fromLocation;
    private String toLocation;

    public Cab(StringBuilder driverName, String passengerName, LocalDate journeyDate, double journeyDistance, String fromLocation, String toLocation) {
        this.driverName = String.valueOf(driverName);
        this.passengerName = passengerName;
        this.journeyDate = journeyDate;
        this.journeyDistance = journeyDistance;
        this.fare = calculateFare();
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    private double calculateFare() {
        return journeyDistance>0?8*journeyDistance:0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cab cab = (Cab) o;
        return Double.compare(journeyDistance, cab.journeyDistance) == 0 && Double.compare(fare, cab.fare) == 0 && Objects.equals(driverName, cab.driverName) && Objects.equals(passengerName, cab.passengerName) && Objects.equals(journeyDate, cab.journeyDate) && Objects.equals(fromLocation, cab.fromLocation) && Objects.equals(toLocation, cab.toLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName, passengerName, journeyDate, journeyDistance, fare, fromLocation, toLocation);
    }

    @Override
    public String toString() {
        return "Cab{" +
                "driverName=" + driverName +
                ", passengerName=" + passengerName +
                ", journeyDate=" + journeyDate +
                ", journeyDistance=" + journeyDistance +
                ", fare=" +fare +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                '}';
    }
}
