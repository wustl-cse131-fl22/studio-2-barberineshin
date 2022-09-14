package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int startAmount;
		double winChance;
		int winLimit;
		double gameResults;
		int totalSimulations = 0;
		int losings = 0;
		double ruinRate;
		double expectedRuinrate;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How much money will you start with?");
		startAmount = scan.nextInt();
		System.out.print("What will be the win chance of the game?");
		winChance = scan.nextDouble();
		double winPercentage = winChance / 100.00;
		System.out.print("What will be your win limit?");
		winLimit = scan.nextInt();
		
		while (startAmount != 0 && startAmount != winLimit)
		{ 
			totalSimulations += 1;
			gameResults = Math.random();
			
			
			if (gameResults <= winPercentage)
			{
				startAmount += 1;
				System.out.println("Simulation " + totalSimulations + ": " + startAmount + " WIN" );
			}
			else if (gameResults >= winPercentage)
			{
				startAmount -= 1;
				System.out.println("Simulation " + totalSimulations + ": " + startAmount + " LOSE" );
				losings += 1;
			}
			
		} double alpha = (1- winPercentage)/winPercentage;
		if (winPercentage == .5 )
		{
			expectedRuinrate = 1 - startAmount/winLimit;
		}
		else 
		{
			
		}
		if (startAmount == 0)
		{
			System.out.print("You lost all your money!");
			System.out.println("Number of Losses: " + losings + "Number of Simulations: " + totalSimulations);
			System.out.print("Ruin rate for this simulation: " + losings/totalSimulations);
		}
		if (startAmount == winLimit)
		{
			System.out.print("You've reached your win limit for the day");
			System.out.println("Number of Losses: " + losings + "Number of Simulations: " + totalSimulations);
			System.out.print("Ruin rate for this simulation: " + losings/totalSimulations);
		}
	}
}
