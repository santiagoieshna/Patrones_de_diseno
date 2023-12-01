package model.dataSolucion;

public class Menor implements StateMadurez {
	private float factorDesarrollo;
	private Ser ser;
	
	public void setContext(Ser context) {
		this.ser= context;
	}
	
	@Override
	public boolean crecer(int cantidad) {
		
		return false;
	}
	@Override
	public void alimentar(int cantidad) {
		// TODO Auto-generated method stub
		
	}
}
