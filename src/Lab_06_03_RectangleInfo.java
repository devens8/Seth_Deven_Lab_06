import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        //declare variables
        double length = 0;
        double width = 0;
        String trash;

        Scanner input = new Scanner(System.in); // set up scanner class

        System.out.print("Please enter the length of the rectangle: "); //takes the length of the rectangle
        if(input.hasNextDouble()){
            length = input.nextDouble();
            input.nextLine();
        }else{
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.print("Please enter the width of the rectangle: "); // takes the width of the rectangle
        if(input.hasNextDouble()){
            width = input.nextDouble();
            input.nextLine();
        }else{
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        System.out.println("The area is " + length*width + ". The perimeter is " + (length*2+width*2) + ". The diagonal is " + Math.sqrt(length*length+width*width));
    }
}
