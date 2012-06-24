package dto;

/**
 * CompilazioneRispostaDTO
 * @author 727826-729399
 * DTO per la classe di dominio {@link} CompilazioneRisposta usato solo per la trasmissione dei dati con rmi e socket
 */
public class CompilazioneRispostaDTO {

	private int idCompilazioneRisposta;
	private String rispostalibera;
	private String testolibero;
	private String range;
	private int compilazioneAssociataIdCompilazione;
	private RispostaDTO rispostaAssociata;
	private ValoriMatriceDTO valoreMatriceAssociato;
	
	public int getIdCompilazioneRisposta() {
		return idCompilazioneRisposta;
	}
	public void setIdCompilazioneRisposta(int idCompilazioneRisposta) {
		this.idCompilazioneRisposta = idCompilazioneRisposta;
	}
	public String getRispostalibera() {
		return rispostalibera;
	}
	public void setRispostalibera(String rispostalibera) {
		this.rispostalibera = rispostalibera;
	}
	public String getTestolibero() {
		return testolibero;
	}
	public void setTestolibero(String testolibero) {
		this.testolibero = testolibero;
	}
	public RispostaDTO getRispostaAssociata() {
		return rispostaAssociata;
	}
	public void setRispostaAssociata(RispostaDTO rispostaAssociata) {
		this.rispostaAssociata = rispostaAssociata;
	}
	public ValoriMatriceDTO getValoreMatriceAssociato() {
		return valoreMatriceAssociato;
	}
	public void setValoreMatriceAssociato(ValoriMatriceDTO valoreMatriceAssociato) {
		this.valoreMatriceAssociato = valoreMatriceAssociato;
	}
	public void setCompilazioneAssociataIdCompilazione(
			int compilazioneAssociataIdCompilazione) {
		this.compilazioneAssociataIdCompilazione = compilazioneAssociataIdCompilazione;
	}
	public int getCompilazioneAssociataIdCompilazione() {
		return compilazioneAssociataIdCompilazione;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getRange() {
		return range;
	}
}
