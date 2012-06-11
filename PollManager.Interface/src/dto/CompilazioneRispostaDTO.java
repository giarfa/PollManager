package dto;

/**
 * 
 * @author Alberto
 *
 */
public class CompilazioneRispostaDTO {

	private int idCompilazioneRisposta;
	private String rispostalibera;
	private String testolibero;
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
}
