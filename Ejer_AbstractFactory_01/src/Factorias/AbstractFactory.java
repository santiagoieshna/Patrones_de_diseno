package Factorias;

import banco02.AbstractProductAccount;
import banco02.AbstractProductCreditCard;
import banco02.AbstractProductDebitCard;

public interface AbstractFactory {

	public AbstractProductAccount createAccount();
	public AbstractProductCreditCard createCreditCard();
	public AbstractProductDebitCard createDebitCard();
}
