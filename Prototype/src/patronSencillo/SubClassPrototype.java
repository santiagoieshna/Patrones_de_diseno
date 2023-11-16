package patronSencillo;

import java.util.Objects;

public class SubClassPrototype extends ConcretePrototype implements Cloneable{
	private String atributoDos;
	private int atributoTres;
	
	public SubClassPrototype() {
		super();
	}
	
	public SubClassPrototype(String atributo2, int atributo3) {
		super();
		this.atributoDos = atributo2;
		this.atributoTres = atributo3;
	}
	
	public SubClassPrototype(String atributoUno, String atributo2, int atributo3) {
		super(atributoUno);
		this.atributoDos = atributo2;
		this.atributoTres = atributo3;
	}

	
	public SubClassPrototype clonar() throws CloneNotSupportedException {
		return (SubClassPrototype) super.clone();
	}

	
	public void present() {
		
		System.out.println(toString());
		
	}

	public String getAtributoDos() {
		return atributoDos;
	}

	public void setAtributoDos(String atributo1) {
		this.atributoDos = atributo1;
	}

	public int getAtributoTres() {
		return atributoTres;
	}

	public void setAtributoTres(int atributo2) {
		this.atributoTres = atributo2;
	}

	@Override
	public String toString() {
		return super.toString()+"SubClassPrototype [atributoUno=" + atributoDos + ", atributoTres=" + atributoTres + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(atributoTres, atributoDos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubClassPrototype other = (SubClassPrototype) obj;
		return atributoTres == other.atributoTres && Objects.equals(atributoDos, other.atributoDos);
	}
	
	
	
}
