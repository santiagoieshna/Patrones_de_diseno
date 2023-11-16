package patron;

public class Adapter implements ClientInterface {
	private Service servicio;
	
	public Adapter(Service servicio) {
		super();
		this.servicio = servicio;
	}
	
	public Adapter() {
		super();
	}

	@Override
	public boolean method(String data) {
		StringBuilder specialData= convertToService(data); 
		return servicio.serviceMethod(specialData);
	}

	private StringBuilder convertToService(String data) {
		StringBuilder specialData = new StringBuilder();
		specialData.append(data);
		return specialData;
	}
	
	

}
