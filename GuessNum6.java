import java.util.Scanner;

public class GuessNum6 {
    public static String decision(int x, int r) {
	if(x == r)
	    return "Excellent! You guessed the number! You guessed in 4 tries.Would you like to play again (y/n)?";
	else if(x < r)
	    return "Too low. Try again.";
	else
	    return "Too high. Try again.";
    }
  public static void main(String[]args) {
  }
}
