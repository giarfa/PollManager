package domain.Test;

import domain.Multipla;
import junit.framework.TestCase;

public class MultiplaTest extends TestCase {
	
	public void testCreaMultipla(){
		Multipla m;
		m=Multipla.CreaMultipla(0, "pippo", true, null, false, 1, null);
		
		assertEquals(0, m.getOrdine());
		assertEquals("pippo", m.getTesto());
		assertEquals(true, m.isObbligatorio());
		assertEquals(null, m.getOrientamento());
		assertEquals(false, m.isSingola());
		assertEquals(1, m.getNumMinRisp());
		assertEquals(null, m.getSondaggioAssociato());
		
	}
	
	public void testModificaMultipla(){
		Multipla m;
		m=Multipla.CreaMultipla(0, "pippo", true, null, false, 1, null);
		
		m.ModificaMultipla(1, "pluto", false, null, true, 2);
		
		assertEquals(1, m.getOrdine());
		assertEquals("pluto", m.getTesto());
		assertEquals(false, m.isObbligatorio());
		assertEquals(null, m.getOrientamento());
		assertEquals(true, m.isSingola());
		assertEquals(2, m.getNumMinRisp());
		assertEquals(null, m.getSondaggioAssociato());
	}

}
