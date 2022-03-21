import java.util.InputMismatchException;
import java.util.Scanner;

import eleve.Classe;
import eleve.Eleve;
import exceptions.NomException;
import exceptions.NoteNegativeException;

public class Main {

	public static void main(String[] args) {
		Eleve unEleve;
		String nom;
		float note;
		Classe sts1;
		
		sts1 = new Classe();
		System.out.println(sts1.toString());
		
		unEleve=saisirEleve();
		
		sts1.ajouterUnEleve(unEleve);
		System.out.println(sts1.toString());
	}
	
	private static String saisirNom() {
		String nom, uneExpReg;
		boolean saisie;
		Scanner unScanner = new Scanner(System.in);
		
		uneExpReg = "[a-zA-Z]+";
		saisie = false;
		do {
			try {
				System.out.println("Donner le nom de l'élève : ");
				nom = unScanner.nextLine();
				if(!nom.matches(uneExpReg)) {
					throw new NomException();
				}
				saisie = true;
			}catch(NomException uneException) {
				nom="Erreur";
			}
		}while(!saisie);
		return(nom);
	}

	private static float saisirNote() {
		float note;
		Scanner unScanner = new Scanner(System.in);
		boolean saisie;
		
		saisie = false;
		do {
			try
			{
				System.out.println("Donner la note de l'élève : ");
				note = unScanner.nextFloat();
				unScanner.nextLine();
				/*while (note < 0) {
					System.out.println("Erreur votre note doit être positive");
					System.out.println("Donner la nouvelle note : ");
					note = unScanner.nextFloat();
					unScanner.nextLine();
				}*/
				if(note<0) {
					throw new NoteNegativeException();
				}
				saisie = true;
			}catch (InputMismatchException uneException) {
				System.out.println("Votre note n'est pas un réel, recommencez : ");
				unScanner.nextLine();
				note = -1;
			} catch (NoteNegativeException e) {
				note = -1;
			}
		}while(!saisie);
		return(note);
	}
	
	static Eleve saisirEleve() {
		String nom;
		float note;
		Eleve unEleve;
		
		nom = saisirNom();
		note = saisirNote(); 
		
		unEleve = new Eleve(nom, note);
		
		return unEleve;
	}
}
