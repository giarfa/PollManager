package domain.Test;

import domain.Matrice;
import junit.framework.TestCase;

public class MatriceTest extends TestCase {
	
	public void testCreaMatrice(){
		
		Matrice m;
		m=Matrice.CreaMatrice(0, "pluto", true, null);
		
		assertEquals(0, m.getOrdine());
		assertEquals("pluto", m.getTesto());
		assertEquals(true, m.isObbligatorio());
		assertEquals(null, m.getSondaggioAssociato());
	}
	
	public void testModificaMatrice(){
		
		Matrice m;
		m=Matrice.CreaMatrice(0, "pluto", true, null);
		m.ModificaMatrice(1, "pippo", false);
		
		assertEquals(1, m.getOrdine());
		assertEquals("pippo", m.getTesto());
		assertEquals(false, m.isObbligatorio());
		assertEquals(null, m.getSondaggioAssociato());
	}

}
