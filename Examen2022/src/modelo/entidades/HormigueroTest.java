package modelo.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HormigueroTest {

    @Test
    void test(){
        Hormiguero hormiguero=new Hormiguero();
        hormiguero.funciona();
        System.out.println("-----");
        assertEquals(hormiguero.cantidadHormigasTotal, hormiguero.getHormigas().size());
        long count = hormiguero.getHormigas().stream().filter((hormiga)->{return hormiga.isEstadoGuerra();}).count();
        System.out.println(count);
        System.out.println(hormiguero.cantidadHormigasGuerreras);
        assertEquals(hormiguero.cantidadHormigasGuerreras, count);
    }
}