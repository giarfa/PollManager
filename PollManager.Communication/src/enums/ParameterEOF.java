package enums;

public enum ParameterEOF {
	UTENTE_DTO("</domain.UtenteDTO>"),
	SONDAGGIO_DTO("</domain.SondaggioDTO>"),
	MULTIPLA_DTO("</domain.MultiplaDTO"),
	LIBERA_DTO("</domain.LiberaDTO"),
	RANGE_DTO("</domain.RangeDTO"),
	MATRICE_DTO("</domain.MatriceDTO"),
	COMPILAZIONE_DTO("</domain.CompilazioneDTO");
	
	private String value;
	
	ParameterEOF(String Value){
		this.value=Value;
	}

	public String getValue() {
		return value;
	}
}
