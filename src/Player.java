import java.util.Scanner;

public class Player {

	static int no_of_players; // static to maintain same copy of no_of_players while creating player's object
	int[] player_guess_num;
	
	int noOfPlayers() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of players want to play the guesser game :");
		int n=sc.nextInt();
		no_of_players=n;
		
		return no_of_players;
	}
	
	int[] playerGuessNum() {
		Scanner sc=new Scanner(System.in);
		
		player_guess_num=new int[no_of_players];
		
		for(int i=0;i<no_of_players;i++) {
			System.out.println("Player " + (i+1) + " please guess the number :");
			player_guess_num[i]=sc.nextInt();
		}
		System.out.println();
		
		return player_guess_num;
	}
	
}
