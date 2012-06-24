package domain;

public enum Orientamento {

	ORIZZONTALE(0),
	VERTICALE(1);
	
	private int idOrientamento;
	
	Orientamento(int idOrientamento){
		this.idOrientamento=idOrientamento;
	}
	
	public int getIdOrientamento(){
		return this.idOrientamento;
	}
	
	public static Orientamento getOrientamento(int idOrientamento){
		switch (idOrientamento){
		case 0:
			return ORIZZONTALE;
		default:
			return VERTICALE;
		}
	}
}
