package pizzeria;

public class HornoLenia implements Horneable{
	private final Integer TIEMPO_PREPARACION;
	
	public HornoLenia(Integer tiempoEspera) {
		TIEMPO_PREPARACION=new Integer(tiempoEspera);
	}

	@Override
	public Float subirTemperatura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer esperarTiempo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza hornear() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
