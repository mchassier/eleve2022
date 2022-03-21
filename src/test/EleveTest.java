/**
 * 
 */
package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.NomException;
import metier.Eleve;

/**
 * @author Mari
 *
 */
class EleveTest {
	private Eleve unEleve;
	
	EleveTest(){
		//unEleve = new Eleve("Mariannick", 15);
	}
	
	@BeforeEach
	public void toto () {
		//System.out.println(unEleve);
		unEleve = new Eleve("Mariannick", 15);
		System.out.println(unEleve);
	}
	
	@AfterEach
	public void toto2 () {
		unEleve = null;
		System.out.println(unEleve);
	}

	@Test
	@DisplayName("Test du constructeur")
	public void testEleve() {
		//Eleve unEleve = new Eleve("Mariannick", 15);
		Eleve lEleve = new Eleve("Mariannick", 15);
		assertEquals("Erreur de nom","Nom:Mariannick Note:15.0",unEleve.toString());
		assertFalse("Les valeurs sont les mêmes",unEleve.toString().equals("Nom:Mariannick Note:16.0"));
		assertTrue("Les valeurs sont différentes",unEleve.toString().equals("Nom:Mariannick Note:15.0"));
		assertNull("L'objet est non null",null);
		assertNotNull("L'objet est null",unEleve);
		//assertSame("Les 2 objets sont différents", unEleve, "Nom:Mariannick Note:15.0");
		assertSame("Les 2 objets sont différents", unEleve, unEleve);
		//lEleve=unEleve;
		assertNotSame("Les 2 objets sont identiques", unEleve, lEleve);
		assertEquals("","","");
	}

	@Test
	public void testGetNom() {
		//Eleve unEleve = new Eleve("Mariannick", 15);
		assertEquals( "Erreur de nom","Mariannick",unEleve.getNom());
	}

	@Test
	public void testSetNom() {
		Eleve unEleve = new Eleve("Mariannick", 15);
		unEleve.setNom("Mari");
		assertEquals( "Erreur de nom","Mari",unEleve.getNom());
	}

	@Test
	public void testSetNote() {
		Eleve unEleve = new Eleve("Mariannick", 15);
		unEleve.setNote(14);
		assertEquals("Erreur de note",14,unEleve.getNote(),0);
	}

	@Test
	public void testGetNote() {
		Eleve unEleve = new Eleve("Mariannick", 15);
		assertEquals("Erreur de note",15,unEleve.getNote(),0);
	}

	@Test
	public void testToString() {
		Eleve unEleve = new Eleve("Mariannick", 15);
		assertEquals( "Erreur de nom","Nom:Mariannick Note:15.0",unEleve.toString());
	}
	
/*	@Test
	public void testNomException() {
		//assertThrows(NomException.class)
		String nom;
		String uneExpReg = "[a-zA-Z]+";
			try {
				nom = "123";
				if(!nom.matches(uneExpReg)) {
					throw new NomException();
				}
			}catch(NomException uneException) {
				nom="Erreur";
				assertThrows(NomException.class,)
			}
	}*/
}
