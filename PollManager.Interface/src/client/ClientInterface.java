package client;

import base.BaseInterface;

public interface ClientInterface extends BaseInterface {

	public void OpenChannel(String clientName);
	
	public void CloseChannel(String clientName);
}
