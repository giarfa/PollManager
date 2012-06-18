package domain;

public enum Orientamento {

	ORIZZONTALE(1),
	VERTICALE(2);
	
	private int idOrientamento;
	
	Orientamento(int idOrientamento){
		this.idOrientamento=idOrientamento;
	}
	
	public int getIdOrientamento(){
		return this.idOrientamento;
	}
	
	public static Orientamento getOrientamento(int idOrientamento){
		switch (idOrientamento){
		case 1:
			return ORIZZONTALE;
		default:
			return VERTICALE;
		}
	}
}
