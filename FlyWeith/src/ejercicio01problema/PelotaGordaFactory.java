package ejercicio01problema;

import java.util.HashMap;


public class PelotaGordaFactory {
//	private HashMap<String, Double> cache;
	private HashMap<String, PelotaGordaType> cache;
	private static PelotaGordaFactory instancia;
	
	private PelotaGordaFactory(){
		cache= new HashMap<>();
	}
	
	public static PelotaGordaFactory getInstance() {
		if(instancia==null)
			instancia = new PelotaGordaFactory();
		return instancia;
	}
	public PelotaGordaType getFlyWeight(double peso,String color) {
		if(cache.get(color)==null) {
			cache.put(color, new PelotaGordaType(peso, color));
		}
		return cache.get(color);
	}
	


}
