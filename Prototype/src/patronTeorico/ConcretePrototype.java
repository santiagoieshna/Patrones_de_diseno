package patronTeorico;

import java.util.Objects;

public class ConcretePrototype implements Prototype {
	private String atributoUno;
	
	
	public ConcretePrototype() {
		super();
	}
	
	public ConcretePrototype(String atributo1) {
		super();
		this.atributoUno = atributo1;
	}

	@Override
	public Prototype clonar() {
		return new ConcretePrototype(this);
	}

	@Override
	public void present() {
		
		System.out.println(this.toString());
	}
	

	public ConcretePrototype(ConcretePrototype prototipo) {
		// Igualo 1 a 1 sus atributos
		 this.atributoUno = prototipo.getAtributoUno();
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
