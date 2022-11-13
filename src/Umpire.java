
// Players & Guesser will guess the number and give to Umpire. Then, umpire will take the decision.

public class Umpire {

	int num_From_Guesser;
	int no_of_players;
	int[] numFromPlayer;
	
	void getGuesserGuessedNumber() {
		Guesser obj=new Guesser();
		
		num_From_Guesser=obj.guesserGuessNum();
	}
	
	void getNoOfPlayers() {
		Player obj=new Player();
		
		no_of_players=obj.noOfPlayers();
	}
	
	void getPlayersGuessedNumber() {
		Player obj=new Player();
		
		numFromPlayer=obj.playerGuessNum();
	}

	void computeResults() {
		
		System.out.println("O/P : Results of the Game are -");
		System.out.println();
		
		for(int i=0;i<no_of_players;i++) {
			if(num_From_Guesser==numFromPlayer[i])
				System.out.println("Player " + (i+1) + " won the game");
			else
				System.out.println("Player " + (i+1) + " lost the game");
		}
		
	}
	
}
