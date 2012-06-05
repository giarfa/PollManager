package domain.Test;

import domain.Range;
import junit.framework.TestCase;

public class RangeTest extends TestCase {

	
	public void testCreaRange(){
		Range r;
		r=Range.CreaRange(0, "pippo", true, 1, 5, "Ciao", "arrivederci", false, null);
		
		assertEquals(0, r.getOrdine());
		assertEquals("pippo", r.getTesto());
		assertEquals(true, r.isObbligatorio());
		assertEquals(1, r.getValMin());
		assertEquals(5, r.getValMax());
		assertEquals("Ciao", r.getDescValMin());
		assertEquals("arrivederci", r.getDescValMax());
		assertEquals(false, r.isRispSingola());
		assertEquals(null, r.getSondaggioAssociato());
	}
	
	public void testModificaRange(){
		
		Range r;
		
		r=Range.CreaRange(0, "pippo", true, 1, 5, "Ciao", "arrivederci", false, null);
		r.ModificaRange(1, "pluto",false, 2, 7, "hello", "bye", true);
		
		assertEquals(1, r.getOrdine());
		assertEquals("pluto", r.getTesto());
		assertEquals(false, r.isObbligatorio());
		assertEquals(2, r.getValMin());
		assertEquals(7, r.getValMax());
		assertEquals("hello", r.getDescValMin());
		assertEquals("bye", r.getDescValMax());
		assertEquals(true, r.isRispSingola());
		assertEquals(null, r.getSondaggioAssociato());
		
		
	}
	
	public void testCorrectVal(){
		Range r;
		r=Range.CreaRange(0, "pippo", true, 1, 5, "Ciao", "arrivederci", false, null);
		assertEquals(true, r.correctVal());
		
		Range r1;
		r1=Range.CreaRange(0, "pippo", true, 5, 1, "Ciao", "arrivederci", false, null);
		assertEquals(false, r1.correctVal());
		
		Range r2;
		r2=Range.CreaRange(0, "pippo", true, 1, 1, "Ciao", "arrivederci", false, null);
		assertEquals(false, r2.correctVal());
	}
}
