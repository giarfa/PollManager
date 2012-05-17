package domain;

import domain.Orientamento;
/**
 * 
 * @author Alberto
 *
 */
public class Multipla extends Domanda {
	
	private Orientamento orientamento;
	private boolean isSingola;
	private short NumMinRisp;
	
	public Orientamento getOrientamento() {
		return orientamento;
	}
	
	public void setOrientamento(Orientamento orientamento) {
		this.orientamento = orientamento;
	}
	
	public boolean isSingola() {
		return isSingola;
	}
	
	public void setSingola(boolean isSingola) {
		this.isSingola = isSingola;
	}
	
	public short getNumMinRisp() {
		return NumMinRisp;
	}
	
	public void setNumMinRisp(short numMinRisp) {
		NumMinRisp = numMinRisp;
	}
	
	
	
}
