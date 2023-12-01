package model.data.solucionJose;

import java.beans.PropertyChangeListener;
import java.util.Optional;

public class AdultoObservable extends EdadObservable{
	
	
	public AdultoObservable(PropertyChangeListener listener) {
		super(listener);
	}

	@Override
	public void aplicarEdad(int edad) {
		
	}

	@Override
	public Optional<EdadObservable> getEdadObservable() {
		return null;
	}

}
