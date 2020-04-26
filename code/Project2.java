// Import a library of functionality to use in this project
import java.util.Scanner;

//  This program prints all of the prime numbers that are strictly between two numbers.

// Java programs are organized into units called “classes”. 
// A class has data and methods that operate on that data.
// This is an 'object' in object-oriented programming (OOP)
public class Project2{

    // In Java programs, the point from where the program starts its execution or simply 
    // the entry point of Java programs is the main() method

    // Public: It is an access modifier, which specifies from where and who can access the method. 
    // Making the main() method public makes it available outside of the Project2 class

    // Static: It is a keyword that means this method (the 'main' method) can be called without creating
    // an instance of the Project2 class

    // Void: It is a keyword and used to specify that a method doesn’t return anything
    // We will see below a method that returns a value as a result
    public static void main(final String args[]) {
        // Prompt the user to enter two integers. We assume that the value being entered
        // is an integer but
        // we do not assume that it is greater than or equal to 0. If the number entered
        // is less than 0,
        // prompt the user again until the number entered is greater than or equal to 0.
        // Once you have a number
        // that is greater than or equal to 0, prompt the user for a second number.
        // Ensure the second number
        // is greater than or equal to 0. Once you have two numbers, call the printPrime
        // function with those values.

        // Create two variables, of type integer, to store the low and high numbers
        int first = -1; // Start with a negative number for the first number
        int second = -1; // Start with a negative number for the second number

        // Scanner is an object. We are creating an instance of this object to use to
        // accept user input
        // It is available in the util package/library, which we imported above
        // We pass it an argument, System.in which is a class that tells the Scanner it
        // will read
        // input from a command line. We could tell Scanner that we will read in a
        // File... new Scanner(File)
        final Scanner input = new Scanner(System.in);

        // This is how Java does a while loop
        while (first < 0) { // While we do not have a positive number
            // Ask the user for a positive first number
            System.out.print("Enter the first positive integer: ");
            first = input.nextInt();
        }

        while (second < 0) { // While we do not have a positive number
            // Ask the user for a positive second number
            System.out.print("Enter the second positive integer: ");
            second = input.nextInt();
        }

        // Close the Scanner to prevent memoriy leaks
        input.close();

        // Pass the positive numbers to the printPrime method
        printPrime(first, second);
    }

    public static void printPrime(int first, int second) {
        // This function accepts two numbers as arguments and prints out all of the
        // prime numbers
        // strictly between those two numbers (i.e. not including those two numbers).
        // Each prime number in the output is separated by a space.

        // Check to see if the numbers given by the user are in descending order and,
        // if so, reverse the order
        if (second < first) {
            // The first number is lower than the second number
            // Reverse their order
            final int tempNum = first; // Hold the larger number in a temporary variable
            first = second; // Make the smaller number the first number
            second = tempNum; // Make the larger number the second number
        }

        String primes = new String(""); // To hold the string to print at the end

        // Loop through all the numbers between (but not including) the user's two
        // numbers
        // Start at first+1 because we only want prime numbers between, but not
        // including
        // the first and second numbers. Continue to loop as long as i is less than
        // (but not equal to) the second number. i++ means to increment i by 1 each loop
        for (int i = first + 1; i < second; i++) {
            if (i > 1) { // Make sure that i is greater than 1 since 2 is the first prime number
                if (isPrime(i)) { // Pass the number to the isPrimes method
                    // This is a prime number, append it to the results
                    primes += i + " ";
                }
            }
        }

        // Check to see if any prime numbers were found between the two numbers
        if (primes.length() == 0) {
            // There were no prime numbers, return a default msg
            primes = "No primes";
        }

        // Print out the results
        System.out.println(primes);
    }

    // The method is private, meaning it can only be used by code inside this class
    // It has a return value of BOOLEAN - which is either TRUE or FALSE
    // Booleans are related to binary programming FALSE = 0, TRUE = 1
    private static boolean isPrime(final int value) {
        // This function checks if a number is a prime number. It returns true
        // if the number is a prime and false otherwise. We will assume that
        // the number is a prime to begin.
        boolean flag = true; // Holds the results of the test
    
        // Check to see if the number passed in is a prime number
        for(int i = 2; i <= value/2; i++){ // Loop from 2 to half the value

            // The '%' below checks for a remainder after division
            // 9 % 2 = 1
            // 10 % 2 = 0
            // 17 % 3 = 2
            if(value % i == 0){
                // This is not a prime number
                flag = false; // Set the flag to false
                break; // Escape from the for loop
            }
        }
    
        // Return a boolean result
        return flag;
    }
}

// Suggestions for changes
// 1. Change to include the first and second numbers in checking for primes
// 2. Print a message when the first and second numbers are being swapped
// 3. Calculate and display a running sum of all the prime numbers identified (advanced)