package Factorias;

import banco02.AbstractProductAccount;
import banco02.AbstractProductCreditCard;
import banco02.AbstractProductDebitCard;
import banco02.ConcreteYoung.ConcreteProdutAccountYoung;
import banco02.ConcreteYoung.CreditCardYoung;

public class ConcreteFactoryYoung implements AbstractFactory{

	@Override
	public AbstractProductAccount createAccount() {
		return new ConcreteProdutAccountYoung();
	}

	@Override
	public AbstractProductCreditCard createCreditCard() {
		return new CreditCardYoung();
	}

	@Override
	public AbstractProductDebitCard createDebitCard() {
		// TODO Auto-generated method stub
		return null;
	}

}
