package exceptions;

public class NomException extends Exception {
	public NomException() {
		System.out.println("Erreur votre nom ne doit contenir que des lettres");
	}
}
