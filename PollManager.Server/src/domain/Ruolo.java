package domain;

public enum Ruolo {
	AMMINISTRATORE(0),
	SEGRETARIO(1),
	COLLABORATORE(2);
	
	private int idRuolo;
	
	Ruolo(int idRuolo){
		this.idRuolo=idRuolo;
	}
	
	public int getIdRuolo(){
		return this.idRuolo;
	}
	
	public static Ruolo getRuolo(int idRuolo){
		switch (idRuolo){
		case 0:
			return AMMINISTRATORE;
		case 1:
			return SEGRETARIO;
		default:
			return COLLABORATORE;
		}
	}
}
