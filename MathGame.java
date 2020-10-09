import java.util.Scanner;
import java.lang.Math;

public class MathGame {


    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        
        System.out.println("Hello and welcome to the two player math game ");
        System.out.println("would you like to play? (y/n)");
        
        String wantPlay = "";
        wantPlay = input.nextLine();

        if(wantPlay.equalsIgnoreCase("y")) {
            System.out.println("You each have 3 lives");

        } else {
            System.out.println("Good-bye");
        }

        int player1Life = 3;
        int player2Life = 3;

        int answer = 0;
        
        while(player1Life > 0 && player2Life > 0) {


            if(player1Life > 0) {

                int randomNum1 = (int)(Math.random() * 10);
                int randomNum2 = (int)(Math.random() * 10);
                int correctAnswer = randomNum1 + randomNum2;

                System.out.println("Player1: what is  " + randomNum1 + "+" + randomNum2);
                answer = input.nextInt();

                if(answer == correctAnswer) {
                    System.out.println("Correct! The lives: Player 1: " + player1Life + "/" + 3);
                } else {
                    player1Life --;
                    System.out.println("Incorrect! The answer was " + correctAnswer + ". the lives: Player 1: " + player1Life + "/" + 3);
                }
            } 

            if(player2Life > 0) {

                int randomNum1 = (int)(Math.random() * 10);
                int randomNum2 = (int)(Math.random() * 10);
                int correctAnswer = randomNum1 + randomNum2;

                System.out.println("Player2: what is  " + randomNum1 + "+" + randomNum2);
                answer = input.nextInt();

                if(answer == correctAnswer) {
                    System.out.println("Correct! The lives: Player 2:" + player2Life + "/" + 3);
                } else {
                     player2Life --;
                     System.out.println("Incorrect! The answer was " + correctAnswer + ". the lives: Player 2: " + player2Life + "/" + 3);
                }
            } 

            if (player1Life == 0) {
                System.out.println("Player 2 wins!");
              } else if (player2Life == 0) {
                System.out.println("Player 1 wins!");
              }

        }










    }

}