package ejercicioB;

public abstract class DataSourceDecorator implements DataSource{
	
	protected DataSource archivo;

	public DataSourceDecorator(DataSource archivo) {
		super();
		this.archivo = archivo;
	}

	@Override
	public void writeData(String data) {
		
	}

	@Override
	public String readData() {
		return null;
	}
	
//	public abstract DataSource quitarCapa();

}
