/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.secondcoach;

/**
 *
 * @author KARL COMPUTERS
 */
public class SecondCoach {
    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in kilometers
        double speedMetersPerSecond = 225.5; // Speed of the second coach in m/s
        
        // Convert speed to km/h (1 m/s = 3.6 km/h)
        double speedKmPerHour = speedMetersPerSecond * 3.6;

        // Calculate travel time in hours
        double travelTimeHours = totalDistance / speedKmPerHour;

        // Departure time in hours (9:00 AM)
        double departureTimeHours = 9.0;

        // Arrival time in hours
        double arrivalTimeHours = departureTimeHours + travelTimeHours;

        // Convert arrival time to 24-hour format
        int arrivalHour = (int) arrivalTimeHours;
        int arrivalMinutes = (int) ((arrivalTimeHours - arrivalHour) * 60);

        System.out.println("Arrival time: " + arrivalHour + ":" + arrivalMinutes);
    }
}

