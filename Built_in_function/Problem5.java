import java.util.*;
public class Problem5 {
    public int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess, feedback = 0;
        Problem5 p = new Problem5();
        while (true) {
            guess = p.generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.println("Enter 1 if high, -1 if low, 0 if correct:");
            feedback = sc.nextInt();
            if (feedback == 0) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback == 1) {
                high = guess - 1;
            } else if (feedback == -1) {
                low = guess + 1;
            }
        }
    }
} 