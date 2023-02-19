import java.util.Scanner;

public class Lab_06_05_HigherLow {
    public static void main(String[] args) {
        //declare variables
        int randomInt = (int)(Math.random()*9+1); // generates a random number 1-10
        int guess = 0;
        String trash;

        Scanner input = new Scanner(System.in); // set up scanner

        System.out.print("Guess a whole number between 1 and 10: "); //Asks the user to enter a number, and stores it
        if(input.hasNextInt()){
            guess = input.nextInt();
            input.nextLine();
        }else{
            trash = input.nextLine(); // stores incorrect input
            System.out.println("Enter a valid number: " + trash); //Outputs value is invalid
        }

        //outputs if the guess was too low or too high
        if(guess == randomInt){
            System.out.println("Your guessed correct!");
        }else if(guess < randomInt){
            System.out.println("Your guess was too low. The correct answer is "+ randomInt);
        } else{
            System.out.println("Your guess was too high. The correct answer is " + randomInt);
        }

    }
}
