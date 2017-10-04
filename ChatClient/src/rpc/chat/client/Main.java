package rpc.chat.client;

public class Main {

	public static void main(String[] args) throws Exception {
		Client client = new Client("TestName");
		
		ClientProxy clientP = new ClientProxy("localhost", 6666);
		
		clientP.anmelden(client);
		
		clientP.broadcast("testMsg", client);
		
		clientP.abmelden(client);

	}

}
