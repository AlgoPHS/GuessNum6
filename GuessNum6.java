/* Compilation: javac GuessNum6.java
   Execution: java GuessNum6
   
  @author Alex Chen, Martha Cryan
  
$ java GuessNum6
Let's play a game! The computer generates an integer between 1 and 1000, and you have to guess it correctly. How many tries will you take?
Round 1: enter an integer between 1 and 1000 (inclusive).
500
Too high. Try again.
250
Too high. Try again.
125
Too high. Try again.
62
Too high. Try again.
32
Too low. Try again.
40
Too low. Try again.
50
Too low. Try again.
56
Too low. Try again.
59
Too low. Try again.
61
Excellent! You guessed the number! You guessed in 10 tries. Would you like to play again (y/n)?
n

 */

import java.util.Scanner;

public class GuessNum6 {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
	String yesorno;
	int round = 0;

	System.out.println("Let's play a game! The computer generates an integer between 1 and 1000, and you have to guess it correctly. How many tries will you take?");
	do {
	    round++;
	    System.out.println("Round " + round + ": enter an integer between 1 and 1000 (inclusive).");
            int num = 1+(int)(100*Math.random());
            int count = 0;
            String ret;
	    int response;
	    
            do {
                int guess = scanner.nextInt();
                count++;
                response = decision(guess, num);
		
                if (response == 0)  ret =  "Excellent! You guessed the number! You guessed in "+count+" tries. Would you like to play again (y/n)?";
                else if (response > 0) ret = "Too high. Try again.";
                else ret = "Too low. Try again.";
		
		System.out.println(ret);
	    } while (response != 0);
            yesorno = scanner.next();	    
        } while (yesorno.equals("y"));
        
    }

    public static int decision(int x, int r) {
	return x - r;
    }

}
