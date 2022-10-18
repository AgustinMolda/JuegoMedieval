package juego;

import java.util.Collection;

public abstract class Artefacto implements IConfigurable {
	private String nombre;
	private int unidadLucha;
	protected Collection<Artefacto> artefactos;
	public Artefacto(String nombre, int unidadLucha) {
		super();
		this.nombre = nombre;
		this.unidadLucha = unidadLucha;
	}
	public void setUnidadLucha(int unidadLucha) {
		this.unidadLucha = unidadLucha;
	}
	
	
	
}
