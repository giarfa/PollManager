package domain;

import java.util.Calendar;

public class Data {
	
	int giorno,mese,anno;

	/*public Data(int giorno,int mese, int anno){
		this.giorno=giorno;
		this.mese=mese;
		this.anno=anno;
	}*/
	
	public static void setDataOdierna(Data data){
		Calendar c= Calendar.getInstance();
		data.giorno=c.get(Calendar.DAY_OF_MONTH);
		data.mese=c.get(Calendar.MONTH);
		data.anno=c.get(Calendar.YEAR);
	}
}
