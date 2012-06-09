package resolver;
import domainManager.*;


public class Resolver {
	private static Resolver instance=null;
	
	private Resolver(){
	}
	
	public static Resolver getInstance(){
		if (instance==null)
			instance=new Resolver();
		return instance;
	}
	
	public CompilazioneManagerInterface getCompilazioneManager(){
		return null;
	}
	
	public RisposteManagerInterface getRisposteManager(){
		return new RisposteManager();
	}
	
	public DomandeManagerInterface getDomandeManager(){
		return new DomandeManager();
	}
	
	public SondaggiManagerInterface getSondaggiManager(){
		return null;
	}
	
	public UtentiManagerInterface getUtentiManager(){
		return new UtentiManager();
	}
}
