import java.util.Scanner;
import java.util.Random;
public class tut {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				Random rand = new Random();
					int randomNumber = rand.nextInt(100) + 1;
					int userGuess = 0; 
					int attempts = 0;
					boolean guessedCorrectly = false;
					
			while (!guessedCorrectly) {
				System.out.print("Enter a number: ");
					userGuess = sc.nextInt();
						attempts++;
						
						
				if (userGuess == randomNumber) { guessedCorrectly = true;
					System.out.println("Congratulations! You guessed correctly.");
		System.out.println("It took you " + attempts + " attempts.");
					int playerscore = 0;
						playerscore = calculateScore(attempts);
		System.out.println("Your Score:" + playerscore);
		
			} else if (userGuess < randomNumber)
	{ System.out.println("Too low! Try again.");
			} else { System.out.println("Too high! Try again.");
				}
		
		
		} sc.close();
	
	
	} 
	public static int calculateScore(int attempts) {
			int maxScore = 100;
			int score = maxScore - attempts;
				if (score < 0)
				{ score = 0; } return score;
			}
		}

