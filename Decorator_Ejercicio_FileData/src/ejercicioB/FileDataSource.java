package ejercicioB;

public class FileDataSource implements DataSource {
	
	private String datos;
	
	@Override
	public void writeData(String data) {
		System.out.print("[Ecribo: "+data+"]");
		this.datos = data;
	}

	@Override
	public String readData() {
		return"[Leo: "+datos+"]";
	}

}
