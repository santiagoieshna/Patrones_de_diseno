package model.dataSolucion;

public class Anciano implements StateMadurez {
	
	private int edadAnciano;
	
	public void setContexto(int contexto) {
		this.edadAnciano=contexto;
	}

	@Override
	public boolean crecer(int cantidad) {
		if(cantidad > this.edadAnciano)
			return true;
		return false;
	}

	@Override
	public void alimentar(int cantidad) {
		// TODO Auto-generated method stub
		
	}
}
