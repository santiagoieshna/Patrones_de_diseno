package impresora;

import java.sql.Date;

public class Documento {
	private String nombre;
	private String autor;
	private String cuerpo;
	private Date fechaCreacion;
	
	public Documento(String nombre, String autor, String cuerpo, Date fechaCreacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.cuerpo = cuerpo;
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Documento:\nnombre=" + nombre + "\nautor=" + autor + "\ncuerpo=" + cuerpo + "\nfechaCreacion="
				+ fechaCreacion + "]";
	}
	
	
}
