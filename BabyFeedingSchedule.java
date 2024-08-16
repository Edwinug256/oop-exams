/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.babyfeedingschedule;

/**
 *
 * @author KARL COMPUTERS
 */
public class BabyFeedingSchedule {
    public static void main(String[] args) {
        // Constants
        double porridgeTotal = 2.0; // Total liters of porridge
        double milkTotal = 2.0; // Total liters of milk
        double servingSizePorridge = 0.5; // Serving size in liters
        double servingSizeMilk = 0.5; // Serving size in liters
        
        int timeBetweenPorridgeFeeds = 45; // minutes
        int timeBetweenMilkFeeds = 30; // minutes
        
        // Calculate number of servings needed
        int numPorridgeServings = (int) (porridgeTotal / servingSizePorridge);
        int numMilkServings = (int) (milkTotal / servingSizeMilk);
        
        // Calculate total feeding time
        int totalPorridgeTime = numPorridgeServings * timeBetweenPorridgeFeeds;
        int totalMilkTime = numMilkServings * timeBetweenMilkFeeds;
        
        // Calculate total time for both feeding times
        int totalTime = Math.max(totalPorridgeTime, totalMilkTime);

        // Output the result
        System.out.println("Total time for the baby to finish both porridge and milk: " + totalTime + " minutes");
    }
}

    