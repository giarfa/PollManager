package domain.Test;

import domain.Libera;
import junit.framework.TestCase;

public class LiberaTest extends TestCase {

	public void testCreaLibera(){
		Libera l;
		l=Libera.CreaLibera(0, "pippo", true, 25, 5, null);
		
		assertEquals(0, l.getOrdine());
		assertEquals("pippo", l.getTesto());
		assertEquals(true, l.getIsObbligatorio());
		assertEquals(25, l.getMaxCaratteri());
		assertEquals(5, l.getMinCaratteri());
		assertEquals(null, l.getSondaggioAssociato());
	}
	
	public void testModificaLibera(){
		Libera l;
		l=Libera.CreaLibera(0, "pippo", true, 25, 5, null);
		l.ModificaLibera(1, "pluto", false, 22, 13);
		
		assertEquals(1, l.getOrdine());
		assertEquals("pluto", l.getTesto());
		assertEquals(false, l.getIsObbligatorio());
		assertEquals(22, l.getMaxCaratteri());
		assertEquals(13, l.getMinCaratteri());
		assertEquals(null, l.getSondaggioAssociato());
		
	}
	
	public void testcorrectValMinMaxChar(){
		
		Libera l;
		l=Libera.CreaLibera(0, "pippo", true, 25, 5, null);
		assertEquals(true, l.correctValMinMaxChar());
		
		Libera l1;
		l1=Libera.CreaLibera(0, "pippo", true, 5, 25, null);
		assertEquals(false, l1.correctValMinMaxChar());
		
		Libera l2;
		l2=Libera.CreaLibera(0, "pippo", true, 25, 25, null);
		assertEquals(true, l2.correctValMinMaxChar());
		
	}
}
