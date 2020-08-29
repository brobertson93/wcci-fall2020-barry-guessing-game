import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int numberToGuess;
        int guess;
        int numberOfGuesses = 10;
        int tempCalc = 0;
        int holdCalc;

        numberToGuess = (int) (Math.random() * 99 + 1);  //generates any number between 1 and 100

        //  System.out.println("Secret number is " + numberToGuess);

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a number to be guessed.");
            guess = input.nextInt();

            System.out.println("You entered: " + guess);

           /* if (guess == numberToGuess) {
                System.out.println("You have guessed correctly! ");
            }
            else if (guess < numberToGuess) {
                System.out.println("You should guess higher");
            }

            else if (guess > numberToGuess) {
                System.out.println("You should guess lower");
            }

            else {
                System.out.println("You have not guessed correctly... LOSER!");
            } */
            holdCalc = tempCalc;
            tempCalc = Math.abs((guess - numberToGuess));

            if (guess == numberToGuess) {
                System.out.println("You have guessed correctly! ");
            }

            else if (numberOfGuesses < 10 && tempCalc < holdCalc){
                System.out.println("You are getting warmer");

            }

            else if (numberOfGuesses < 10 && tempCalc > holdCalc){
                System.out.println("You are getting colder");
            }

         //   System.out.println(tempCalc);



            numberOfGuesses--;
            System.out.println("You have " + numberOfGuesses + " guesses remaining!");

        }
        while (guess != numberToGuess && numberOfGuesses > 0);

        System.out.println("You ran out of guesses!");

    }
}
