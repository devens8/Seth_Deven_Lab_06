import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        //declare variables
        double temperatureF = 0;
        String trash;

        Scanner input = new Scanner(System.in); // set up scanner

        System.out.print("Please enter a temperature in Celsius: "); // Output question to user
        if(input.hasNextDouble()){
            temperatureF = (input.nextDouble() *9.0/5.0) + 32; // conversion to F
            input.nextLine();
        } else {
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.println("The temperature in Fahrenheit is: " + temperatureF); // outputs the temperature in F
    }
}