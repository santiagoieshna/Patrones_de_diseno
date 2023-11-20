package ejercicio01problema;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class noFly {
public static void main(String[] args) {
	
	ArrayList<PelotaGorda> pelotas=new ArrayList<>();
	String[] colores = {"AzulCeleste", "NegroMachista", "AmarrilloChillon", "RojoPopulista", "AzulMpuntoRajoy", "NaranjaVerdoso", "VerdeAgua","RojoPimineta"};
	
	for (int i = 0; i < 100000; i++) {
		int x = new Random().nextInt(100);
		int y = new Random().nextInt(100);
		int colorIndex = new Random().nextInt(8);
		double peso = new Random().nextDouble()*new Random().nextInt(1000);
		pelotas.add(new PelotaGorda(x , y , peso, colores[colorIndex]));
	}
	
	for (PelotaGorda pelota : pelotas) {
		pelota.botar();
	}
	
	System.out.println("Pon algo");
	new Scanner(System.in).nextInt();
}
}
