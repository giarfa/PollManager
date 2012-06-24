package util;

import org.modelmapper.ModelMapper;

/**
 * 
 * @author 727826-729399
 *
 */
public class DTOMapper {
	private static DTOMapper instance=null;
	private ModelMapper mapper;
	
	/**
	 * Costruttore
	 */
	private DTOMapper(){
		mapper=new ModelMapper();
	}
	/**
	 * Get Istanza di DTOMapper
	 * @return istanza
	 */
	public static DTOMapper getInstance(){
		if(instance==null)
			instance=new DTOMapper();
		return instance;
	}
	
	/**
	 * Map
	 * @param <T>
	 * @param source
	 * @param destinationType
	 * @return
	 */
	public <T> T map(Object source, Class<T> destinationType){
		return mapper.map(source, destinationType);
	}
}
