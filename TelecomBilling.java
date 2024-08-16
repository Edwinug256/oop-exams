/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.telecombilling;

/**
 *
 * @author KARL COMPUTERS
 */

    public class TelecomBilling {

    public static void main(String[] args) {
        // Initial airtime loaded
        double loadedAirtime = 10000.0;

        // Calculate the airtime tax (10% of the loaded amount)
        double airtimeTax = loadedAirtime * 0.10;

        // Deduct the tax from the loaded airtime
        double balanceAfterTax = loadedAirtime - airtimeTax;

        // Call details
        int callDurationInSeconds = 5 * 60; // 5 minutes converted to seconds
        int callRatePerSecond = 200;

        // Calculate the cost of the call
        double callCost = callDurationInSeconds * callRatePerSecond;

        // Calculate the final balance after the call
        double finalBalance = balanceAfterTax - callCost;

        // Output the final balance
        System.out.println("The balance after the call is: UGX " + finalBalance);
    }
}


    
