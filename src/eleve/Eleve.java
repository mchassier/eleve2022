package eleve;


public class Eleve {
	private String nom;
	private float note;
	
	public Eleve (String nom, float note){
		this.nom = nom;
		this.note = note;
	}
	
	public String getNom() {
		return(this.nom);
	}
	
	public float getNote() {
		return(this.note);
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNote(float note) {
		this.note = note;
	}
	
	public String toString() {
		return ("Nom : "+ this.getNom()+ " Note : "+ this.note);
	}
	
}
