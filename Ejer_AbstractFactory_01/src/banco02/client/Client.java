package banco02.client;

import Factorias.AbstractFactory;
import banco02.AbstractProductAccount;
import banco02.AbstractProductCreditCard;

public class Client {
	AbstractFactory client;
	public AbstractProductAccount account;
	
	public Client(AbstractFactory client) {
		super();
		this.client = client;
		account=client.createAccount();
	}
	
	
	
}
