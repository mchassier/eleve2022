package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Main;
import metier.Eleve;

class MainTest {

	@Test
	final void testSaisirEleve() {
		Eleve unEleve;
		unEleve = Main.saisirEleve();
		assertEquals("Mari",unEleve.getNom(),"Problème de nom");
	}

}
