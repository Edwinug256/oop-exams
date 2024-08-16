/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.traveltime;

/**
 *
 * @author KARL COMPUTERS
 */
public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in kilometers
        int speed = 250; // Speed of the train in km/h
        int stopTimeMinutes = 5; // Time taken for each stop in minutes
        
        // Calculate the total number of stops
        int stopDistanceLoading = 150;
        int stopDistanceRefuel = 200;
        int stopsForLoading = totalDistance / stopDistanceLoading;
        int stopsForRefueling = totalDistance / stopDistanceRefuel;
        int totalStops = Math.max(stopsForLoading, stopsForRefueling);

        // Calculate time for stops in hours
        double totalStopTimeHours = (totalStops * stopTimeMinutes) / 60.0;

        // Calculate travel time (distance / speed) in hours
        double travelTimeHours = (double) totalDistance / speed;

        // Total time is travel time plus stop time
        double totalTimeHours = travelTimeHours + totalStopTimeHours;

        System.out.println("Total time taken for the journey: " + totalTimeHours + " hours");
    }
}

