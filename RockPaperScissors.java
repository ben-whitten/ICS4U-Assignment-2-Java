/*
* The RockPaperScissors program implements an application that
* plays rock paper scissors with the user.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-4 
*/

import java.util.Scanner;  // Import the Scanner class

public class RockPaperScissors {

  public static final int options = 3;

  /**
   * Function which determiens the result.
   */
  static String resultCalculations(String playerChoice) {

    final int cpuChoice = (int) (Math.random() * options + 1);
    String result;
    String stringCpuChoice;

    // Converting the cpu's choice from int to string for text.
    if (cpuChoice == 1) {
      stringCpuChoice = "ROCK";
    } else if (cpuChoice == 1) {
      stringCpuChoice = "PAPER";
    } else {
      stringCpuChoice = "SCISSORS";
    }

    System.out.println("CPU chose " + stringCpuChoice);

    // Determining who won.
    if (stringCpuChoice.equals("ROCK") && playerChoice.equals("PAPER")) {
      result = "WON";
    } else if (stringCpuChoice.equals("PAPER") && playerChoice.equals("SCISSORS")) {
      result = "WON";
    } else if (stringCpuChoice.equals("SCISSORS") && playerChoice.equals("ROCK")) {
      result = "WON";
    } else if (stringCpuChoice.equals(playerChoice)) {
      result = "TIED";
    } else {
      result = "LOST";
    }

    return result;
  }

  /**
   * This function handles the input and output of the program.
   */
  public static void main(String[] args) {
    try {
      //Getting the rock, paper, or scissors from user.
      Scanner scan = new Scanner(System.in);
      System.out.println("Pick one of the following [ROCK] [PAPER] "
                         + "[SCISSORS]: ");
      String playerChoice = scan.nextLine();

      System.out.println();
      System.out.println("You chose " + playerChoice);

      // Making sure the user doesnt input something like bob.
      if (playerChoice.equals("ROCK") == false && playerChoice.equals("PAPER")
          == false && playerChoice.equals("SCISSORS") == false) {
        System.out.println("ERROR: Invalid Input");
      } else {
        // Determining if they won or not.
        String result = resultCalculations(playerChoice);

        // Outputing the result.
        System.out.println("YOU " + result);
      }

    } catch (Exception e) {
      System.out.println("AN ERROR HAS OCCURED");
    }
  }
}
