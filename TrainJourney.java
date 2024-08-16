/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.trainjourney;

/**
 *
 * @author KARL COMPUTERS
 */
public class TrainJourney {
    public static void main(String[] args) {
        int totalDistance = 10000; // Distance from Kampala to Kabale
        int stopDistanceLoading = 150; // Distance after which the train stops to load/unload passengers
        int stopDistanceRefuel = 200; // Distance after which the train stops to refuel

        // Number of stops for loading/unloading passengers
        int stopsForLoading = totalDistance / stopDistanceLoading;
        
        // Number of stops for refueling
        int stopsForRefueling = totalDistance / stopDistanceRefuel;

        // Total number of stops (maximum of the two)
        int totalStops = Math.max(stopsForLoading, stopsForRefueling);

        System.out.println("Total number of stops: " + totalStops);
    }
}

