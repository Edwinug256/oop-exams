/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.returnjourney;

/**
 *
 * @author KARL COMPUTERS
 */
public class ReturnJourney {
    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in kilometers
        int speed = 250; // Speed of the train in km/h
        int stopTimeMinutes = 5; // Time taken for each stop in minutes
        
        // Calculate the number of stops for refueling
        int stopDistanceRefuel = 200;
        int stopsForRefueling = totalDistance / stopDistanceRefuel;

        // Calculate time for stops in hours
        double totalStopTimeHours = (stopsForRefueling * stopTimeMinutes) / 60.0;

        // Calculate travel time (distance / speed) in hours
        double travelTimeHours = (double) totalDistance / speed;

        // Total time is travel time plus stop time
        double totalTimeHours = travelTimeHours + totalStopTimeHours;

        System.out.println("Total time taken for the return journey: " + totalTimeHours + " hours");
    }
}

