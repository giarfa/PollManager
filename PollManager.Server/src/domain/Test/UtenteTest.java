package domain.Test;

import domain.Utente;
import junit.framework.TestCase;

public class UtenteTest extends TestCase {
	
	
	public void testCreaUtente(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abc");
		
		assertEquals("pippo", u.getNome());
		assertEquals("pluto", u.getCognome());
		assertEquals("abc", u.getPassword());
		assertEquals(0, u.getMatricola());
	}
	
	public void testModificaUtente(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abc");
		u.ModificaUtente(1, null, "pietro", "giovanni", "cba");
		
		assertEquals("pietro", u.getNome());
		assertEquals("giovanni", u.getCognome());
		assertEquals("cba", u.getPassword());
		assertEquals(1, u.getMatricola());
		
	} 
	
	public void testModificaUtentePassword(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abc");
		u.ModificaUtente("bac89y");
		
		assertEquals("pippo", u.getNome());
		assertEquals("pluto", u.getCognome());
		assertEquals("bac89y", u.getPassword());
		assertEquals(0, u.getMatricola());
	}
	
	public void testsetDisable(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abc");
		u.setDisable();
		assertEquals(false, u.isAttivo());
	}
	
	public void testsetEnable(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abc");
		u.setEnable();
		assertEquals(true, u.isAttivo());
	}
	
	public void testsetDisableandEnable(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abc");
		u.setDisable();
		assertEquals(false, u.isAttivo());
		u.setEnable();
		assertEquals(true, u.isAttivo());
	}
	
	public void testCorrectPassword(){
		Utente u;
		u=Utente.CreaUtente(0, null, "pippo", "pluto", "abcdef");
		assertEquals(true, u.correctPassword());
		
	}

}
