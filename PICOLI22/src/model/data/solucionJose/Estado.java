package model.data.solucionJose;

import java.util.ArrayList;

public class Estado {
	public ArrayList<Ser> seres = new ArrayList<>();
	public ArrayList<Ser> menores = new ArrayList<>();
	public ArrayList<Ser> adultos = new ArrayList<>();
	public ArrayList<Ser> trabajadores = new ArrayList<>();
	public ArrayList<Ser> parados = new ArrayList<>();
	public ArrayList<Ser> ancianos = new ArrayList<>();
	//debe ser mas alta que lo que se paga al trabajador
	float cantidadPorTrabajador=300;
	float coeficienteDemandaNacimientos=0;
	int defuncionesPeriodoAnterior=0;
	
	/**
	 * Que tiene que hacer el estado
	 * me interesa el que y luego el como
	 * hace un unico proceso anual. Se llama gestionarPeriodo o algo asi
	 * en que consiste?
	 * primero debe cerrar el periodo anterior. 
	 * Debe saber cuanto fabrico, que dinero tiene
	 * Debe pagar a todos
	 * envejecer a todos, saber cuantas defunciones ha habido
	 * con eso cierra el periodo
	 * Ahora debe comenzar el nuevo periodo. con la informacion de la demanda.
	 * Esto es un porcentaje de incremento/decremento sobre la produccion del periodo anterior
	 * puede establecer los trabajadores que necesita y segun el coeficiente de 
	 * demanda y el numero de defunciones, planificar los naciemientos
	 * en resumen, primero el ultimo dia del periodo n y luego el primer dia del 
	 * periodo n+1
	 * 
	 */
	
	//cosas que tiene que hacer el estado
	//producir, pagar y generar nacimientos
	
	//producir
	//a principio de anno mira la demanda externa y mira si la produccion potencial
	//primer dia del periodo
	public void producir(long demandaExterna) {
		 contratar(demandaExterna);
		 adecuarNacimientos(demandaExterna);
	}
	
	//ocurre el primer del dia del periodo
	private void adecuarNacimientos(long demandaExterna) {
		//la formula para hallar el coeficiente puede ser
		//el coeficiente se saca de demanda/produccion. Este valor puede ser 1 o mayor.
		//1 quiere decir que no necesitamos mas trabajadores.
		//cada coeficiente nuevo se calcula con (coefienteAnterior+coeficienteActual)/2
		//se hace asi para que el nuevo coeficiente pese mas que el anterior
//		cantidadTrabajores*(coeficiente-1)/18
		//
		//reemplazamos el numero de nacimientos con el de las defunciones del ultimo dia del periodo anterior. Si el coeficiente
		//es <1 no reemplazamos todos
	}
	
	private void contratar(long demandaExterna) {
		int cantidadTrabajadoresNecesarios=(int) (demandaExterna/cantidadPorTrabajador);
		int diferencia=cantidadTrabajadoresNecesarios-trabajadores.size();
		gestionarContratacion(diferencia);
	}

	private long getProduccionReal() {
		return (long) (trabajadores.size()*cantidadPorTrabajador);
	}
	private void gestionarContratacion(int diferencia) {
		if(diferencia>0)
			contratarTrabajadores(diferencia);
		else if(diferencia<0){
			despedirTrabajores(diferencia);
		}
	}
	
	private void despedirTrabajores(int diferencia) {
		diferencia=Math.abs(diferencia);
		for (int i = 0; i < diferencia; i++) {
			Ser remove = trabajadores.remove(0);
			if(remove==null) return;			
			parados.add(remove);
		}
		
	}

	private void contratarTrabajadores(int diferencia) {
		diferencia=Math.abs(diferencia);
		for (int i = 0; i < diferencia; i++) {
			Ser remove = parados.remove(0);
			if(remove==null) return;			
			trabajadores.add(remove);
		}
		
	}
	//ultimo dia del periodo
	//pagar y gestionar defunciones
	//o sea, primero se hace el ultimo dia del periodo n y luego el primer dia del periodo n+1

}
