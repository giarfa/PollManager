package domainManager;

public class DomainManagerFactory {

	private static DomainManagerFactory instance=null;
	private CompilazioniManager compilazioniManager=null;
	private DomandeManager domandeManager=null;
	private RisposteManager risposteManager=null;
	private SondaggiManager sondaggiManager=null;
	private UtentiManager utentiManager=null;
	
	public static DomainManagerFactory getInstance(){
		if(instance==null)
			instance=new DomainManagerFactory();
		return instance;
	}
	
	private DomainManagerFactory(){
		
	}

	public CompilazioniManager getCompilazioniManager() {
		if(this.compilazioniManager==null)
			this.compilazioniManager=new CompilazioniManager();
		return this.compilazioniManager;
	}

	public DomandeManager getDomandeManager() {
		if(this.domandeManager==null)
			this.domandeManager=new DomandeManager();
		return this.domandeManager;
	}

	public RisposteManager getRisposteManager() {
		if(this.risposteManager==null)
			this.risposteManager=new RisposteManager();
		return this.risposteManager;
	}

	public SondaggiManager getSondaggiManager() {
		if(this.sondaggiManager==null)
			this.sondaggiManager=new SondaggiManager();
		return this.sondaggiManager;
	}

	public UtentiManager getUtentiManager() {
		if(this.utentiManager==null)
			this.utentiManager=new UtentiManager();
		return this.utentiManager;
	}
	
}
