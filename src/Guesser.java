import java.util.Scanner;

public class Guesser {

	int guesser_guess_num;
	
	int guesserGuessNum() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Guesser please guess the number :");
		int n=sc.nextInt();
		guesser_guess_num=n;
		
		return guesser_guess_num;
	}
	
}
