package modelo.entidades;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.insectos.*;
import modelo.oficio.HormigaGuerrera;
import modelo.oficio.HormigaRecolectora;
import modelo.soporte.*;

public class Hormiguero implements PropertyChangeListener{
    Statistics statistics;
    public final int cantidadHormigasTotal = 30;
    public final int cantidadHormigasGuerreras = 15;
    // 1 El hormiguero crea 30 hormigas (Todas recolectoras) 
    
    private boolean atacada = false;
    private boolean tareaAcabada = false;


    private List<Hormiga> hormigas;
//    private static long id = 1;

    public Hormiguero() {
        super();
        hormigas = new ArrayList<Hormiga>();
        statistics = new Statistics();
    }

    public void funciona() {
        int historia = 0;
        int guerreras = 0;
        do {
            historia++;
            //las hormigas hacen lo que le toca
            for (int i = 0; i < hormigas.size(); i++) {
//            	System.out.println("entro");
                Hormiga hormiga = hormigas.get(i);
                hormiga.hacerTarea();
            }
            
            if (historia % 100 == 0) {
                //estamos en guerra o en paz
                atacada = !atacada;
                if (atacada) {
                    System.out.println("estamos en guerra");
                    convertirHormigasGuerra(cantidadHormigasGuerreras - contarHormigasGuerreras());
                } else {
                    //fin de la guerra
                    System.out.println("volvemos a la paz");
                    convertirHormigasPaz();
                }
            }
            //puede que se hayan muerto algunas
            if (atacada) {
                guerreras = cantidadHormigasGuerreras - contarHormigasGuerreras();
//                if (guerreras > 0) {
//                    System.out.println("hormigas guerreras muertas " + guerreras);
//                }
            } else {
                guerreras = 0;
            }
//            enterrarHormigas();
            crearHormigas(guerreras);
            if (historia == 310) setTareaAcabada(true);;
//            if (cantidad % 20 == 0) System.out.println("historia " + cantidad);
        } while (!isTareaAcabada());
        
        //mostrar estadisticas
//        System.out.println(statistics.getCurrentMediaAlimento());
//        System.out.println(statistics.getCurrentIndiceGlobal());
    }

    public List<Hormiga> getHormigas() {
		return hormigas;
	}

	public void setHormigas(List<Hormiga> hormigas) {
		this.hormigas = hormigas;
	}

	private void convertirHormigasGuerra(int i) {
        int contador=0;
        for (int j = 0; j < cantidadHormigasGuerreras; j++) {
        	Hormiga hormiga = hormigas.get(j);
        	// TODO esto tendra que ser borrado
            hormiga.setEstadoGuerra(true);
            // Metemos el strategy 
            hormiga.setOficio(new HormigaGuerrera(hormiga));
            contador++;
        }
        System.out.println("hormigas  guerreras convertidas "+contador);
    }

    private void convertirHormigasPaz() {
        int contador=0;
        for (Hormiga hormiga : hormigas) {
        
            if (hormiga.isEstadoGuerra()) {
            	hormiga.setEstadoGuerra(false);
            	hormiga.setOficio(new HormigaRecolectora(hormiga));
                contador++;
            }
        }
        System.out.println("hormigas  convertidas a la paz "+contador);
    }

    private int contarHormigasGuerreras() {
        int contador = 0;
        int chivato = 0;
        int recolectora=0;
        for (Hormiga hormiga : hormigas) {
            if (hormiga.isEstadoGuerra()) contador++;
            if (hormiga.isGuerrera()) chivato ++;
            if (hormiga.isRecolectora()) recolectora ++;
        }
        System.out.println("Chivato vale: "+chivato);
        System.out.println("Chivato vale: "+recolectora);
        return contador;
    }

//    private void enterrarHormigas() {
//        for (Iterator<Hormiga> iterator = hormigas.iterator(); iterator.hasNext(); ) {
//            Hormiga next = iterator.next();
//            if (!next.isAlive()) {
//                statistics.addData(new HormigaData(next.getAlimentos(), next.getVida(), next.getId()));
//                iterator.remove();
//            }
//        }
//    }
    private void enterrarHormigas(Hormiga hormiga) {
//    		System.out.println("Intierro numero"+ hormiga.id);
			statistics.addData(new HormigaData(hormiga.getAlimentos(), hormiga.getVida(), hormiga.getId()));
			this.hormigas.remove(hormiga);
    }

    private void crearHormigas(int guerreras) {
        int contador = 0;
        for (int i = hormigas.size(); i < cantidadHormigasTotal; i++) {
            Hormiga hormiga = new Hormiga();
            // Subscribirte a la hormiga Para el Observer
            hormiga.addListener(this);
            hormiga.setOficio(new HormigaRecolectora(hormiga));
            if (guerreras-- > 0) {
            	hormiga.setEstadoGuerra(true);
                hormiga.setOficio(new HormigaGuerrera(hormiga));
            }
            hormigas.add(hormiga);
            contador++;
        }
    }


    private boolean isTareaAcabada() {
        return tareaAcabada;
    }

    private void setTareaAcabada(boolean tareaAcabada) {
        this.tareaAcabada = tareaAcabada;
    }

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		Hormiga hormiga = (Hormiga) evt.getNewValue();
		enterrarHormigas(hormiga);	
	}


}
