package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.util.List;

import dto.CompilazioneDTO;
import dto.CompilazioneRispostaDTO;
import dto.LiberaDTO;
import dto.MatriceDTO;
import dto.MultiplaDTO;
import dto.RangeDTO;
import dto.RispostaDTO;
import dto.SondaggioDTO;
import dto.UtenteDTO;
import dto.ValoriMatriceDTO;
import exception.InvalidCredentialException;

public class ClientSocket implements ClientSocketInterface {

	private String host;
	private int port = 4445;
	private Socket socket;
	private PrintWriter writer;
    private BufferedReader reader;
	
	public ClientSocket(String host){
		this.host=host;
	}
	
	@Override
	public void OpenChannel(String clientName) {
		try {
			socket = new Socket(host , port);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        writer = new PrintWriter(socket.getOutputStream(), true);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void CloseChannel(String clientName) {
		// TODO Auto-generated method stub

	}

	@Override
	public UtenteDTO Login(String user, String password)
			throws RemoteException, InvalidCredentialException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Logout(UtenteDTO utente) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public SondaggioDTO SondaggioGetByKey(int idSondaggio) throws RemoteException {
		this.WriteOnSocket("SondaggioGetByKey");
		return null;
	}

	@Override
	public List<SondaggioDTO> SondaggioGetList() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SondaggioDTO SondaggioCrea(SondaggioDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SondaggioDTO SondaggioModifica(SondaggioDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SondaggioAggiungiDomandaMultipla(MultiplaDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void SondaggioAggiungiDomandaLibera(LiberaDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void SondaggioAggiungiDomandaRange(RangeDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void SondaggioAggiungiDomandaMatrice(MatriceDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public CompilazioneDTO SondaggioAggiungiCompilazione(CompilazioneDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SondaggioSetEnable(int idSondaggio) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void SondaggioSetDisable(int idSondaggio) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaModifica(MultiplaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaModifica(LiberaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaModifica(RangeDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaModifica(MatriceDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaModifica(ValoriMatriceDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaAggiungiValoriMatrice(ValoriMatriceDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaAggiungiRisposta(RispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaSetEnable(int idDomanda) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void DomandaSetDisable(int idDomanda) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public RispostaDTO RispostaModifica(RispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RispostaSetEnable(int idRisposta) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void RispostaSetDisable(int idRisposta) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public CompilazioneDTO CompilazioneModifica(CompilazioneDTO dto)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CompilazioneAggiungiCompilazioneRisposta(
			CompilazioneRispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void CompilazioneSetEnable(int idCompilazione)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void CompilazioneSetDisable(int idCompilazione)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public CompilazioneRispostaDTO CompilazioneRispostaModifica(
			CompilazioneRispostaDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CompilazioneRispostaElimina(int idCompilazioneRisposta)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public UtenteDTO UtenteGetByKey(int idUtente) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UtenteDTO> UtenteGetList() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UtenteDTO UtenteCrea(UtenteDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UtenteDTO UtenteModifica(UtenteDTO dto) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UtenteSetEnable(int idUtente) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void UtenteSetDisable(int idUtente) throws RemoteException {
		// TODO Auto-generated method stub

	}

	private String ReadFromSocket(){
		try {
			while(!reader.ready()){
				Thread.sleep(500);
			}
			return reader.readLine();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void WriteOnSocket(String message){
		this.writer.write(message);
		this.writer.flush();
	}
}
