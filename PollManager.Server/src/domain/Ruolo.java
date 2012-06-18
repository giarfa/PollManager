package domain;

public enum Ruolo {
	AMMINISTRATORE(1),
	SEGRETARIO(2),
	COLLABORATORE(3);
	
	private int idRuolo;
	
	Ruolo(int idRuolo){
		this.idRuolo=idRuolo;
	}
	
	public int getIdRuolo(){
		return this.idRuolo;
	}
	
	public static Ruolo getRuolo(int idRuolo){
		switch (idRuolo){
		case 1:
			return AMMINISTRATORE;
		case 2:
			return SEGRETARIO;
		default:
			return COLLABORATORE;
		}
	}
}
