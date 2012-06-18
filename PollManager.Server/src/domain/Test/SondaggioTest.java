package domain.Test;

import domain.Sondaggio;
import junit.framework.TestCase;

public class SondaggioTest extends TestCase {

	public void testCreaSondaggio(){
		Sondaggio s;
		s=Sondaggio.CreaSondaggio("pippo", "pluto e topolino");
		
		assertEquals(0, s.getIdSondaggio());
		assertEquals(true, s.isAttivo());
		assertEquals("pippo", s.getTitolo());
		assertEquals("pluto e topolino", s.getDescrizione());
	}
	
	
	public void testModificaSondaggio(){
		
		Sondaggio s;
		s=Sondaggio.CreaSondaggio("pippo", "pluto e topolino");
		
		s.ModificaSondaggio("paperino", "minnie e harry potter");
		assertEquals(0, s.getIdSondaggio());
		assertEquals(true, s.isAttivo());
		assertEquals("paperino", s.getTitolo());
		assertEquals("minnie e harry potter", s.getDescrizione());
	}
	
	public void testsetDisable(){
		Sondaggio s;
		s=Sondaggio.CreaSondaggio("pippo", "pluto e topolino");
		s.setDisable();
		assertEquals(false, s.isAttivo());
	}
	
	public void testsetEnable(){
		Sondaggio s;
		s=Sondaggio.CreaSondaggio("pippo", "pluto e topolino");
		s.setEnable();
		assertEquals(true, s.isAttivo());
	}
	
	public void testsetDisableandEnable(){
		Sondaggio s;
		s=Sondaggio.CreaSondaggio("pippo", "pluto e topolino");
		s.setDisable();
		assertEquals(false, s.isAttivo());
		s.setEnable();
		assertEquals(true, s.isAttivo());
	}
	
}
