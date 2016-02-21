import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double touchDowns;
		double totalYards;
		double interceptions;
		double completions;
		double ATT;
		double a;
		double b;
		double c;
		double d;
		double passerRating;
		System.out.println("how many touchdowns did the player get?");
		touchDowns=input.nextDouble();
		System.out.println("how many total yards did the player get?");
		totalYards=input.nextDouble();
		System.out.println("how many interceptions did the player get?");
		interceptions=input.nextDouble();
		System.out.println("how many completions did the player get?");
		completions=input.nextDouble();
		System.out.println("How many number of passes attempted did the player get?");
        ATT=input.nextDouble();
	    a = ((completions/ATT)-.3)*5;
	    b = ((totalYards/ATT)-3)*.25;
	    c = ((touchDowns/ATT)*20);
	    d = (2.375-((interceptions/ATT)*25));
        passerRating = (((a+b+c+d)/6)*100);
        System.out.printf ("Your Passer Rating is: %.2f",passerRating);
        }
	
}
