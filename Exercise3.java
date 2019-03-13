import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		String SCISSORS = "Scissors";
		String PAPER = "Paper";
		String ROCK = "Rock";
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Paper, Scissors, or Rock? ");
		String player1Move = scanner.nextLine();
		System.out.format("Player 1 plays %s\n", player1Move);
		System.out.print("Paper, Scissors, or Rock? ");
		String player2Move = scanner.nextLine();
		System.out.format("Player 2 plays %s\n", player2Move);
		
		if(player1Move.equals(player2Move)) {
			System.out.println("Draw");
		}
		
		else if((player1Move.equals(SCISSORS) && player2Move.equals(PAPER)) ||
				(player1Move.equals(PAPER) && player2Move.equals(ROCK)) ||
				(player1Move.equals(ROCK) && player2Move.equals(SCISSORS))) {
			System.out.println("Player 1 Wins !");
		}
		
		else {
			System.out.println("Player 2 Wins !");
		}
		
		
	}

}
