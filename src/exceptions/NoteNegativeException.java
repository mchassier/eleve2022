package exceptions;

public class NoteNegativeException extends Exception {
	public NoteNegativeException() {
		System.out.println("Erreur votre note doit �tre positive. Recommencez");
	}
}
