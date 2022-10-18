package juego;

import java.util.Collection;
import java.util.HashSet;

public class Espada extends Artefacto {
	

	private int unidadLucha;
	public Espada(String nombre, int unidadLucha) {
		super(nombre, unidadLucha);
		this.unidadLucha= unidadLucha;
		
		iniciarArtefacto();
	}


	
	private void iniciarArtefacto() {
		this.artefactos = new HashSet<Artefacto>();
	}



	public void configurar(Collection<Artefacto> artefactos) {
		setUnidadLucha(this.unidadLucha);
		this.artefactos = artefactos;
	}
	

}
