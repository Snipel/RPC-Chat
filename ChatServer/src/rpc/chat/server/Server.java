package rpc.chat.server;
import java.util.ArrayList;
import java.util.List;

import rpc.chat.interfaces.IClient;
import rpc.chat.interfaces.IServer;

public class Server implements IServer {
	
	List<IClient> clients = new ArrayList<>();

	@Override
	public void broadcast(String msg, IClient client) {
		for (IClient iClient : clients) {
			iClient.empfangen(client.gibName() + "schreibt: " + msg);
		}
	}

	@Override
	public void anmelden(IClient client) {
		clients.add(client);

	}

	@Override
	public void abmelden(IClient client) {
		clients.remove(client);

	}

}
