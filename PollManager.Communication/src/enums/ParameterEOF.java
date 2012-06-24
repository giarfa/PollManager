package enums;
/**
 *  @author 727826-729399
 *
 */
public enum ParameterEOF {
	UTENTE_DTO("</domain.UtenteDTO>"),
	SONDAGGIO_DTO("</domain.SondaggioDTO>"),
	MULTIPLA_DTO("</domain.MultiplaDTO"),
	LIBERA_DTO("</domain.LiberaDTO"),
	RANGE_DTO("</domain.RangeDTO"),
	MATRICE_DTO("</domain.MatriceDTO"),
	VALORIMATRICE_DTO("</domain.ValoriMatriceDTO>"),
	COMPILAZIONE_DTO("</domain.CompilazioneDTO"),
	COMPILAZIONERISPOSTA_DTO("</domain.CompilazioneRispostaDTO"),
	RISPOSTA_DTO("</RispostaDTO>"),
	ERRORE_DTO("</ErroreDTO>"),
	LIST_DTO("</list>");
	
	private String value;
	
	ParameterEOF(String Value){
		this.value=Value;
	}

	public String getValue() {
		return value;
	}
}
