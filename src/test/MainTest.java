package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main;
import eleve.Eleve;

class MainTest {

	@Test
	void testSaisirEleve() {
		Eleve unEleve;
		unEleve = Main.saisirEleve();
		assertEquals("Mari",unEleve.getNom(),"Pas ok");
		assertEquals(12f,unEleve.getNote(),"Pas ok");
	}

}
