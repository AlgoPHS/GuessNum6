import java.util.Scanner;

public class GuessNum6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner();
        do {
            int num = Math.Random.nextInt(100)+1;
            int count = 0;
            String ret;
            do {
                int guess = scanner.nextInt();
                count++;
                int response = decision(guess, num);
                if (response == 0) ret = "Excellent! You guessed the number! You guessed in "+count+" tries. Would you like to play again (y/n)?";
                else if (response > 0) ret = "Too high. Try again.";
                else ret = "Too low. Try again.";
            } while (response != "Excellent! You guessed the number! You guessed in "+count+" tries. Would you like to play again (y/n)?");
            String yesorno = scanner.next();
        } while (yesorno == "y");
        
    }
}
