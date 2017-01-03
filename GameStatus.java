
abstract class Games 
{
	void displayScore()
	{
		System.out.println("Your Score is...");
	}
	abstract void playGame();
	abstract void computeScore();
}
class Cricket extends Games
{
	void playGame()
	{
		System.out.println("Starting the game...");
	}
	void computeScore()
	{
		System.out.println("Your Score is computing...");
		
	}
}
class Badminton extends Games
{
	void playGame()
	{
	System.out.println("Starting the game...");
	}
	void computeScore()
	{
		System.out.println("Your Score is computing...");
	}
}
class Football extends Games
{
	void playGame()
	{
		System.out.println("Starting the game...");
	}
	void computeScore()
	{
		System.out.println("Your Score is computing...");
	}
}
class ConsoleGame
{
	public static void main(String args[])
	{
	Cricket c = new Cricket();
	System.out.println("Cricket...");
	c.playGame();
	c.computeScore();
	c.displayScore();
	Badminton b = new Badminton();
	System.out.println("Badminton...");
	b.playGame();
	b.computeScore();
	b.displayScore();
	Football f = new Football();
	System.out.println("Football...");
	f.playGame();
	f.computeScore();
	f.displayScore();
	}
	
}
	


