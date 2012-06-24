package domainManager;

/**
 * Domain Manager
 * @author 727826-729399
 * 
 */
public class DomainManagerFactory {

	private static DomainManagerFactory instance=null;
	private CompilazioniManager compilazioniManager=null;
	private DomandeManager domandeManager=null;
	private RisposteManager risposteManager=null;
	private SondaggiManager sondaggiManager=null;
	private UtentiManager utentiManager=null;
	
	/**
	 * Istanza di DomainManagerFactory
	 * @return
	 */
	public static DomainManagerFactory getInstance(){
		if(instance==null)
			instance=new DomainManagerFactory();
		return instance;
	}
	/**
	 * Costruttore
	 */
	private DomainManagerFactory(){
		
	}

	/**
	 * Get CompilazioniManager
	 * @return compilazioniManager
	 */
	public CompilazioniManager getCompilazioniManager() {
		if(this.compilazioniManager==null)
			this.compilazioniManager=new CompilazioniManager();
		return this.compilazioniManager;
	}
	
	/**
	 * Get DomandeManager
	 * @return DomandeManager
	 */
	public DomandeManager getDomandeManager() {
		if(this.domandeManager==null)
			this.domandeManager=new DomandeManager();
		return this.domandeManager;
	}

	/**
	 * Get RisposteManager
	 * @return RisposteManager
	 */
	public RisposteManager getRisposteManager() {
		if(this.risposteManager==null)
			this.risposteManager=new RisposteManager();
		return this.risposteManager;
	}

	/**
	 * Get SondaggiManager
	 * @return	SondaggiManager
	 */
	public SondaggiManager getSondaggiManager() {
		if(this.sondaggiManager==null)
			this.sondaggiManager=new SondaggiManager();
		return this.sondaggiManager;
	}

	/**
	 * Get Utentimanager
	 * @return Utentimanager
	 */
	public UtentiManager getUtentiManager() {
		if(this.utentiManager==null)
			this.utentiManager=new UtentiManager();
		return this.utentiManager;
	}
	
}
