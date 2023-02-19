import java.util.Scanner;

public class Lab_06_04_MetricConverter{
    public static void main(String[] args) {
        //declare variables
        double meters = 0;
        String trash;

        Scanner input =  new Scanner(System.in);

        System.out.print("Please enter the measurement in meters: "); //takes the input in meters
        if(input.hasNextDouble()){
            meters = input.nextDouble();
            input.nextLine();
        }else{
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.println("The measurement in miles is " + meters*0.00062137);
        System.out.println("The measurement in feet is " + meters*3.2808399);
        System.out.println("The measurement in inches is " + meters*39.3700787);
    }
}
