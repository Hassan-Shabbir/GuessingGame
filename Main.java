import java.util.Random;
import java.util.Scanner;

class Main {
  static String score = "Your score is: ";
  static String chance = "Remaining chances are: ";
  static String winMessage = "CONGRATULATIONS! You've won.";
  static String loseMessage = "SORRY, GAME OVER.";
  static String greatMessage = "The number you have entered is greater than the number chosen by the program.";
  static String lessMessage = "The number you have entered is less than the number chosen by the program.";
  static String timeover = "Sorry, game over, your time has been exhausted."; 

  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int value = rand.nextInt(101);
    System.out.println(value);

    boolean won = false;
    int gameScore = 100;
    int guess = 0;

    while (gameScore > 0 && !won) {
      System.out.println("Enter a guess: ");
      guess = Integer.parseInt(scanner.nextLine());
      if (guess == value) {
        System.out.println(winMessage);
        won = true;
      }
      else if (guess < value) {
        System.out.println(lessMessage);
        gameScore -= 10;
      }
      else {
        System.out.println(greatMessage);
        gameScore -= 10;
      }
    }
    System.out.println(score + gameScore);
    System.out.println(chance + gameScore / 10);

    if (!won) {
      System.out.println(loseMessage);
    }
  }
}