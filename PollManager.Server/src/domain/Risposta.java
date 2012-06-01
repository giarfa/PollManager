package domain;

public class Risposta {
	private int ordine;	
	private String testo;
	private boolean hasTestoLibero, isNotRisponde;
	private Domanda domandaAssociata;

	
	
	public static Risposta CreaRisposta(int ordine, String testo, boolean hasTestoLibero, boolean isNotRisponde){
		Risposta risposta= new Risposta();
		risposta.ordine=ordine;
		risposta.testo=testo;
		risposta.hasTestoLibero=hasTestoLibero;
		risposta.isNotRisponde=isNotRisponde;
		return risposta;
	}
	
	
}
