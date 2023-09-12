import java.util.Scanner;
public class NumberGuessingGame 
{
	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
		int K = 5, i, guess;
		int turns=0;
		System.out.println("*** WELCOME TO NUMBER GUESSING GAME ***");
		System.out.println("A number is chosen between 1 to 100.");
		System.out.println("NOTE : Guess the number within 5 trials.");
        System.out.println("Best of luck!");
		for (i = 0; i < K; i++) 
		{
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			turns++;
			if (number == guess) 
			{
				System.out.println("CONGRATULATIONS!!!");
				System.out.println("HURRAY!!! You have guessed the number correctly.");
				System.out.println("You used "+turns+" turns to guess the right number");
				if(turns==1) System.out.println("Your score is 100 out of 100");
				else if(turns==2) System.out.println("Your score is 80 out of 100");
				else if(turns==3) System.out.println("Your score is 60 out of 100");
				else if(turns==4) System.out.println("Your score is 40 out of 100");
				else if(turns==5) System.out.println("Your score is 20 out of 100");
    
				break;
			}
			else if (number > guess && i != K - 1) 
			{
				System.out.println("The number is greater than " + guess);
				System.out.println("Turns left: "+(4-i));
			}
			else if (number < guess && i != K - 1) 
			{
				System.out.println("The number is less than " + guess);
				System.out.println("Turns left: "+(4-i));
			}
		}

		if (i == K) 
		{
			System.out.println("You have exhausted 5 trials.");
			System.out.println("The number was " + number);
		    System.out.println("BETTER LUCK NEXT TIME!");
		}
	}
		public static void main(String args[])
	{
		guessingNumberGame();
	}
}