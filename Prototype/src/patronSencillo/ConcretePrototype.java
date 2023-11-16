package patronSencillo;

import java.util.Objects;

public class ConcretePrototype implements Cloneable {
	private String atributoUno;
	
	
	public ConcretePrototype() {
		super();
	}
	
	public ConcretePrototype(String atributo1) {
		super();
		this.atributoUno = atributo1;
	}

	public ConcretePrototype clonar() throws CloneNotSupportedException {
		return (ConcretePrototype) super.clone();
	}
	
	protected void present() {
		
		System.out.println(this.toString());
	}
	

	public String getAtributoUno() {
		return atributoUno;
	}

	public void setAtributoUno(String atributo1) {
		this.atributoUno = atributo1;
	}

	@Override
	public String toString() {
		return "ConcretePrototype [atributoUno= " + atributoUno + "] ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(atributoUno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcretePrototype other = (ConcretePrototype) obj;
		return Objects.equals(atributoUno, other.atributoUno);
	}
	
	
}
