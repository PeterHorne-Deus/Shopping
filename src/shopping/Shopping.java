/*
 * Peter Horne-Deus
 * Shopping.java
 * This is a program to calculates the cost of buying multiple computer devices
 * October 2,2018
 */

package shopping;

import java.util.Scanner;
import java.text.*;

public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Creating a decimal formate
        DecimalFormat x = new DecimalFormat("$##.##");
        
        //Creating Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables
        int numUSBStorage,numKeyboard,numMice;
        double totalCostUSB,totalCostKeyboard,totalCostMice,total;
        final double costUSB = 19.99;
        final double costKeyboard= 49.99;
        final double costMice = 25.99;
        
        System.out.println("Enter the number of USB storage devices you would like to buy.");
        numUSBStorage = keyedInput.nextInt();
        
        System.out.println("Enter the number of Mice you would like to buy.");
        numMice = keyedInput.nextInt();
        
        System.out.println("Enter the number of Keyboards you would like to buy.");
        numKeyboard = keyedInput.nextInt();
        
        totalCostUSB = numUSBStorage * costUSB;
        totalCostKeyboard = numKeyboard * costKeyboard;
        totalCostMice = numMice * costMice;
        total = totalCostUSB + totalCostKeyboard + totalCostMice;
        
        
        System.out.println("************************************");
        System.out.println("The cost of the USB storage Devices: " + x.format(costUSB) + "\n");
        System.out.println("The cost of the Mice: " + x.format(costMice) + "\n");
        System.out.println("The cost of the Keyboards: " + x.format(costKeyboard) + "\n \n");
        System.out.println("The total cost: " + x.format(total));
        
        keyedInput.close();
    }
    
}
