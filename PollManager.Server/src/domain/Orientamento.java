package domain;
/**
*
* @author 727826-729399
*/
public enum Orientamento {

	ORIZZONTALE(0),
	VERTICALE(1);
	
	private int idOrientamento;
	
	Orientamento(int idOrientamento){
		this.idOrientamento=idOrientamento;
	}
	/**
	 * 
	 * @return idOrientamento
	 */
	public int getIdOrientamento(){
		return this.idOrientamento;
	}
	/**
	 * 
	 * @param idOrientamento
	 * @return this
	 */
	public static Orientamento getOrientamento(int idOrientamento){
		switch (idOrientamento){
		case 0:
			return ORIZZONTALE;
		default:
			return VERTICALE;
		}
	}
}
