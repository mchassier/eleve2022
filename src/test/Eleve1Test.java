package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metier.Eleve;

class Eleve1Test {

	@Test
	void testEleve() {
		//fail("Not yet implemented");
		Eleve unEleve;
		unEleve = null;
		assertNull("L'objet n'est pas null",unEleve);
		//assertNotNull("L'objet est null",unEleve);
		
		unEleve = new Eleve ("Chassier",15);
		assertNull("L'objet n'est pas null",unEleve);
	}

	@Test
	void testGetNom() {
		//fail("Not yet implemented");
		Eleve unEleve;
		unEleve = new Eleve ("Chassier",15);
		assertFalse ("Les 2 noms sont différents",!unEleve.getNom().equals("Chassier"));
	}

	@Test
	void testGetNote() {
		//fail("Not yet implemented");
		Eleve unEleve;
		unEleve = new Eleve ("Chassier",15);
		assertTrue ("Les 2 notes sont différentes",unEleve.getNote() == 15);
	}

	@Test
	void testSetNom() {
		//fail("Not yet implemented");
		Eleve unEleve;
		unEleve = new Eleve ("Chassier",15);
		unEleve.setNom("Mari");
		assertNotEquals ("Le nom est correct", "Mari", unEleve.getNom());
	}

	@Test
	void testSetNote() {
		//fail("Not yet implemented");
		Eleve unEleve,lEleve;
		unEleve = new Eleve ("Chassier",15);
		unEleve.setNote(13);
		/*lEleve = new Eleve ("Chassier",15);
		lEleve = unEleve;
		assertSame("Notes différentes",unEleve,lEleve);*/
		assertTrue ("Note incorrecte",15==unEleve.getNote());
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
		Eleve unEleve;
		unEleve = new Eleve ("Chassier",15);
		assertEquals ("L'affichage n'est pas correct", "Nom : Chassier Note : 15.0", unEleve.toString());
	}

}
