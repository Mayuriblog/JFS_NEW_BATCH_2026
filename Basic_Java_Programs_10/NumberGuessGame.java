import java.util.*;

class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int attempts = 0, maxAttempts = 5;

        while(attempts < maxAttempts) {
            System.out.print("Enter guess: ");
            int guess = sc.nextInt();
            attempts++;

            if(guess == number) {
                System.out.println("Correct in " + attempts + " attempts!");
                return;
            } else if(guess > number) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
        }

        System.out.println("Game Over! Number was: " + number);
    }
}