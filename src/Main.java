import java.util.InputMismatchException;
import java.util.Scanner;

import eleve.Eleve;
import exceptions.NomException;
import exceptions.NoteNegativeException;

public class Main {

	public static void main(String[] args) {
		Eleve unEleve;
		String nom;
		float note;
		
		nom = saisirNom();
		note = saisirNote();
		
		unEleve = new Eleve(nom, note);
		System.out.println("Nom : "+ unEleve.getNom()+ " Note : "+ unEleve.getNote());
		
		nom = saisirNom();
		unEleve.setNom(nom);
		System.out.println(unEleve.toString());
		
		note = saisirNote();
		unEleve.setNote(note);
		System.out.println(unEleve.toString());
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
}
