package serializer;

import com.thoughtworks.xstream.XStream;

public class Serializer {

	private static Serializer instance = null;
	private XStream converter;
	
	private Serializer(){
		this.converter=new XStream();
	}
	
	public static Serializer getInstance(){
		if (instance==null)
			instance=new Serializer();
		return instance;
	}
	
	public String toXML(Object source){
		return this.converter.toXML(source);
	}
	
	public Object fromXML(String xml){
		return this.converter.fromXML(xml);
	}
}
