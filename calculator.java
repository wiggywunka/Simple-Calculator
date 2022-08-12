/**
 *
 * @author WiggyWunka
 */

import java.util.Scanner;

public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Defining Scanner for User Input
        // NOTE: userinput is not necessary to get user input. You can call it
        // bananasonrice or shoefairy and it'd still work.
        Scanner userinput = new Scanner(System.in);
        
        // Defining variables as doubles for decimal purposes
        double number1, number2, total;
        
        // Begin main program
        // Introduction
        System.out.println("Welcome to a basic 2 number calculator!");
        
        // Getting user input for first number
        System.out.println("Please enter your first digit:");
        number1 = userinput.nextDouble();
        
        // Getting user input for second number
        System.out.println("Please enter your second number:");
        number2 = userinput.nextDouble();
        
        // Multiplying numbers to get total
        total = number1 * number2;
        
        // Displaying total to user
        System.out.println("Your answer is " + total);
        
    }
    
}
