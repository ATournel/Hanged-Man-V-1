import java.util.Scanner;

public class Pendu {
	
//Consigne au joueur + nombre de lettres dans le mot
	
	public static void consigne(int a) {
		System.out.println("Proposez un mot de " + a + " lettres en minuscules,");
		System.out.println("Vous avez 10 essais!");
	}
	
//Partie
	
	public static int essais = 10;
	public static int score = 500;
	private static Scanner uW;
	
	public static void partie(String wordToFind, int a) {
		uW = new Scanner(System.in);
		while (essais > 0) {
			final String userWord = uW.next();
			if (userWord.length()>a) {
				System.out.println("Word to long, try again!");
			}
			else {
				if (userWord.equals(wordToFind)) {
					System.out.println("Vous avez gagné!");
					System.out.println("Score: " + score + ".");
				}
				else {
					essais = essais-1; //essais--;
					score = score-10; //score -= 10;
					if (essais > 2) {						
						System.out.println("Vous avez " + essais + " essais restants!");
					}
					else if (essais > 1) {						
						System.out.println("Vous avez " + essais + " essai restant!");
					}
					else {						
						System.out.println("Vous avez perdu!");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
//Indiquer nombre de lettres
		consigne(5);
//Indiquer mot à trouver		
		partie("bisou", 5);
	}

}