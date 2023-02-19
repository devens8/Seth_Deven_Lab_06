import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {
        //declare variables
        double gallonsOfGas = 0;
        double fuelEfficiency = 0;
        double priceOfGas = 0;
        String trash = "";

        Scanner input = new Scanner(System.in); // Set up scanner class

        System.out.print("Please enter the gallons of gas in the tank: "); //Outputs question and takes gallons of gas input
        if(input.hasNextDouble()){
            gallonsOfGas = input.nextDouble();
            input.nextLine();
        } else {
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.print("Please enter the fuel efficiency: "); //Outputs question and takes fuel efficiency input
        if(input.hasNextDouble()){
            fuelEfficiency = input.nextDouble();
            input.nextLine();
        } else {
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.print("Please enter the price of gas per gallon: "); //Outputs the question and takes the price of the gas per gallon
        if(input.hasNextDouble()){
            priceOfGas = input.nextDouble();
            input.nextLine();
        } else {
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.println("The cost for a for a hundred miles is $" + (100.0/fuelEfficiency)*priceOfGas + " and the mileage left with " + gallonsOfGas + " gallons is " + gallonsOfGas*fuelEfficiency );

    }
}
