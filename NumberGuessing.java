import java.util.Random;

import java.util.Scanner;

public class NumberGuessing {

    void game(){
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int lowerlim = 1;

        int higherlim = 10;

        int Gussingnumber = random.nextInt(higherlim - lowerlim + 1) + lowerlim;

        int Attemptslimit = 10;

        int currentAttempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Enter your guessing number between " + lowerlim + " to " + higherlim);

        while (currentAttempts < Attemptslimit) {
            System.out.print("Enter the number you guess :- ");
            int guess = scanner.nextInt();
            currentAttempts++;
            if (guess  < Gussingnumber && guess <= Gussingnumber - 5 ) {
                System.out.println("Your guess is too low.....Try again.");
            } 
            else if (guess < Gussingnumber && guess > Gussingnumber - 5 ){
                System.out.println("Your guess is low.....Try again");
            }

            else if (guess > Gussingnumber && guess < Gussingnumber + 5) {
                System.out.println("Your guess is high.....Try again.");

            } 
            else if (guess > Gussingnumber && guess > Gussingnumber + 5){
                System.out.println("Your guess is too high....Try again");
            }
            else {
                System.out.println("Yes, You Won the match in " + currentAttempts + " attempts.");
                break;
            }
            int remainingAttempts = Attemptslimit - currentAttempts;
            if (remainingAttempts > 0) {
                System.out.println("You have " + remainingAttempts + " attempts remaining.");
            } else {
                System.out.println("Sorry, you lose the game. dont have next Atempts. The number was:- " + Gussingnumber + ".");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        NumberGuessing obj=new NumberGuessing();
        obj.game();
    }
}

