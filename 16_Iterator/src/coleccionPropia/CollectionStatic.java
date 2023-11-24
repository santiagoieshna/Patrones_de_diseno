package coleccionPropia;

public class CollectionStatic {
	private int[] arra;
	private int addPosition; //Posicion actual en la que puedo añadir
	

	public CollectionStatic(int size) {
		super();
		arra = new int[size];
		this.addPosition=0;
	}
	
	private CollectionStatic(int size, int addPosition) {
		super();
		arra = new int[size];
		this.addPosition=addPosition;
	}

	public boolean add(int number) {
		// TODO
		// Version 2.0 add a member
		// when limit is reached
		
		if(!capacityExceded()) {
			arra[addPosition++]=number;
			return true;
		}
		return false;
	}

	private boolean capacityExceded() {
		return addPosition>=arra.length;
	}
	
	public int remove(int position) {
		if(!addPositionExceded(position) && position>0) {
			int valorBorrado = arra[position];
			desplazarColeccion(position);
			return valorBorrado;
		}
		return -1;
	}

	private void desplazarColeccion(int position) {
		for(int i=position; i<addPosition-1; i++) {
			arra[i]= arra[i+1];
		}
		addPosition--;
	}

	private boolean addPositionExceded(int position) {
		return position>=addPosition;
	}

	public int indexOf(int value) {
		for(int i = 0 ; i < addPosition; i++) {
			if(arra[i]==value)
				return i;
		}
		return -1;
	}

	public int get(int position) {
		if(!addPositionExceded(position)&& position>0){
			return arra[position];
		}

		return -1;
	}
	public int size() {
		return addPosition;
	}
}
