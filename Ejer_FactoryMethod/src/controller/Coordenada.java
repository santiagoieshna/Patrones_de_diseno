package controller;

import java.util.ArrayList;
import java.util.List;

public class Coordenada {
	private int X;
	private int Y;
	
	public Coordenada() {
		super();
	}
	
	public Coordenada(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	
	public List<Coordenada> getContiguas() {
		List<Coordenada> contiguas = new ArrayList<>();
		
		for ( int i = (getY()-1); i< (getY()+2); i++) {
			for(int j = (getX()-1); j<(getX()+2); j++) {
				if(i == getY() && (j==(getX()-1) || j==(getX()+1)))
					contiguas.add(new Coordenada(j, i));
				if( (i==(getY()-1) || i==(getY()+1)) && j==getX() )
					contiguas.add(new Coordenada(j, i));
			}
		}
		
		return contiguas;
	}

	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + X;
		result = prime * result + Y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		if (X != other.X)
			return false;
		if (Y != other.Y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coordenada (X=" + X + ", Y=" + Y + ")";
	}
	

	
}
