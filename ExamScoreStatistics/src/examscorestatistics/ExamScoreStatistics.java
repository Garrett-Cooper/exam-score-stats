/*
 *CIT 111 Intro to Programming
 *First Java Program
 *09/30/2014
 *Author:  Garrett Gcooper
 *Exam Score Statistics
*/

package examscorestatistics;

//Import java utility and text packages to use the scanner and format classes.

import java.text.DecimalFormat;
import java.util.Scanner;


public class ExamScoreStatistics {
   
    public static void main(String[] args) {
        
        //Create a Scanner variable, 'console', for reading user input values.  
        Scanner console = new Scanner (System.in);
        
        //Create a DecimalFormat variable, 'percent', to format the average statistic.     
        DecimalFormat percent = new DecimalFormat("#0.0%");
        
        //Declare and initialize variables
        int tempNumber; //Variable that temporary holds all of the user input values.
        int sum = 0; //Variable that will hold the total of all integers for average calculation.
        int minimum = Integer.MAX_VALUE; //Initialized variable that holds minimum user input value.
        int maximum = Integer.MIN_VALUE; //Initialized variable that holds maximum user input value.
        final int TOTALNUMBERS = 10; //Total amount of integers & loop iterations.
        final int HIGH = 100; //Constant variable that holds high-end of possible user input values.
        final int LOW = 0; //Constant variable that holds low-end of possible user input values.
        
        //Prints out header information  
        System.out.println("CIT111 Fall 2014 Assignment 4"); 
        System.out.println("Garrett Cooper"); 
        System.out.println("Exam Score Statistics"); 
        
        //Prompts the user to enter 10 integer values between 0 (LOW) and 100 (HIGH). 
        System.out.println("\nPlease enter " + TOTALNUMBERS + " scores "
                + "between " + LOW + " and " + HIGH + ":");
        
        //Creates a 'for loop' that runs 10 iterations, provided the numbers...
        //are between 0 and 100.
            for (int i= 1; i<=TOTALNUMBERS; i++) {    
                
                //Creates a 'do/while loop' that ensures the user does not...
                //enter a value <0 or >100.
                do {
                    
                    //Ask the user to input one ("i") of 10 possible scores.
                    System.out.print("*Enter score " + i + " of " + TOTALNUMBERS + 
                    ", as an integer > ");
                    
                    //Temp variable holds user input
                    tempNumber = console.nextInt();
                    
                    //If statements checks to make sure user input values 
                    //are between 0-100; if not, then a statement appears
                    //alerting the user they have entered an incorrect value.
                    if (!(tempNumber >=0 && tempNumber <= 100)) {
                        
                    System.out.println("Invalid score. Please try again.");    
                    
                    }
                
                    } while (!(tempNumber >=0 && tempNumber <= 100));
                
                //Sum aggregates the 'proper' (i.e. 0-100) user input values over 10 iterations.
                sum += tempNumber;
                
                //Calculates the minimum 'proper' user input value over 10 iterations.
                if (tempNumber < minimum) 
                    
                    {
                        minimum = tempNumber; //Holds current minimum value.
                    }
                    
                //Calculates the maximum 'proper' user input value over 10 iterations.
                if (tempNumber > maximum) 
                    
                    {
                        maximum = tempNumber; //Holds current maximum value.
                    }
                
            }
            
    //Prints out to the console summary statistics:
    System.out.println("\nSUMMARY STATISTICS:");     
    System.out.println("-Total of " + TOTALNUMBERS + " scores = " + sum); //Total of 'proper' user input values.
    System.out.println("-Average of " + TOTALNUMBERS + " scores = " 
            + percent.format((double)(sum)/TOTALNUMBERS/100)); //Average of 'proper' user input values in percent format
    System.out.println("-Minimum of " + TOTALNUMBERS + " scores = " + minimum); //Minimum of 'proper' user input values.
    System.out.println("-Maximum of " + TOTALNUMBERS + " scores = " + maximum); //Minimum of 'proper' user input values.
    System.out.println();
    
    }
    
}
