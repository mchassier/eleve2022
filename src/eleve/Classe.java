package eleve;

public class Classe {
	private Eleve uneClasse[];
	private int nbEleves;

	public Classe() {
		this.nbEleves = 0;
		uneClasse = new Eleve[24];
	}
	
	public int getNbEleves() {
		return (this.nbEleves);
	}
	
	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}

	public Eleve[] getUneClasse() {
		return (this.uneClasse);
	}
	
	//Cette méthode sera très peu utilisée
	public void setUneClasse(Eleve uneClasse[]) {
		this.uneClasse = uneClasse;
	}
	
	public String toString () {
		String laClasse;
		int indice;
		
		laClasse = "Liste des élèves \n";
		for(indice=0;indice<this.nbEleves;indice++) {
			laClasse += this.uneClasse[indice].toString()+"\n";
		}
		return (laClasse);
	}
	
	
}
