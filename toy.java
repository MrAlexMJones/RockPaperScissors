import java.util.Scanner;
import java.util.Random;

public class toy
{
	public static void main(String[] args)
	{
		gameStart();
	}

	public static void gameStart()
	{
		int rps = 1; // rps is your value
		String hand = "Rock";
		String ohand = "Rock";
		System.out.println("Lets Play Rock Paper Scissors!");
		System.out.println("1 for Rock. 2 for paper. and 3 for Scissors.");
		Scanner reader = new Scanner(System.in);
		rps = reader.nextInt();
		if (rps == 1){
			hand = "Rock";
		}
		else if (rps == 2){
			hand = "Paper";
		}
		else if (rps == 3){
			hand = "Scissor";
		}
		else if (rps == 100){
			hand = "Atom Bomb";
		}
		else {
			hand = "invalid entry";
		}
		System.out.println("You Chose:" + hand);

		int rpsO = 1; // rpsO is opponants value
		Random rand = new Random();
		rpsO = rand.nextInt(3);
		rpsO = rpsO + 1;

		if (rpsO == 1){
			ohand = "Rock";
		}
		else if (rpsO == 2){
			ohand = "Paper";
		}
		else if (rpsO == 3){
			ohand = "Scissor";
		}
		else {
			hand = "ERROR #1";
		}
		System.out.println("I Chose:" + ohand);

		if (rps == rpsO){
			System.out.println("ITS A DRAW");
		}
		else if (rps == 100){
			System.out.println("MEGA EXPLOSION!!!! YOU WINNNNNN!!!!!!");
		}
		else if (rps == 1 && rpsO == 3){
			System.out.println("You Win!");
		}
		else if (rps == 2 && rpsO == 1){
			System.out.println("You Win!");
		}
		else if (rps == 3 && rpsO == 2){
			System.out.println("You Win!");
		}
		else{
			System.out.println("Sorry. You Lose");
		}
	}

}
