package util;

import org.modelmapper.ModelMapper;

public class DTOMapper {
	private static DTOMapper instance=null;
	private ModelMapper mapper;
	
	private DTOMapper(){
		mapper=new ModelMapper();
	}
	
	public static DTOMapper getInstance(){
		if(instance==null)
			instance=new DTOMapper();
		return instance;
	}
	
	public <T> T map(Object source, Class<T> destinationType){
		return mapper.map(source, destinationType);
	}
}
