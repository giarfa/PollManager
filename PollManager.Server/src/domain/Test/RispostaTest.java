package domain.Test;

import domain.Risposta;

import junit.framework.TestCase;

public class RispostaTest extends TestCase {
	
	public void testCreaRisposta(){
		Risposta r;
		r=Risposta.CreaRisposta(0, "ciao a tutti", true, false, null);
		
		assertEquals(0, r.getIdRisposta());
		assertEquals(0, r.getOrdine());
		assertEquals(true, r.isHasTestoLibero());
		assertEquals("ciao a tutti", r.getTesto());
		assertEquals(false, r.isNonRisponde());
	}
	
	
	public void testModificaRisposta(){
		
		Risposta r;
		r=Risposta.CreaRisposta(0, "ciao a tutti", true, false, null);
		
		r.ModificaRisposta(1, "minnie e harry potter", false, true, null);
		
		assertEquals(0, r.getIdRisposta());
		assertEquals(1, r.getOrdine());
		assertEquals(false, r.isHasTestoLibero());
		assertEquals("minnie e harry potter", r.getTesto());
		assertEquals(true, r.isNonRisponde());
	}

}
