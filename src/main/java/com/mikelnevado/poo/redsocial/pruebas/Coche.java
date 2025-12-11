package com.mikelnevado.poo.redsocial.pruebas;

import java.util.ArrayList;
import java.util.List;

public class Coche implements Vehiculo{
	
	private String matricula;
	
	private List<Persona> asegurados;
	
	
	public Coche() {
		this.asegurados = new ArrayList<>();
	}

	@Override
	public int numeroRuedas() {
		return 4;
	}

	@Override
	public void setMatricula(String matricula) {
		 this.matricula = "COCHE-"+matricula;
		
	}

	@Override
	public void addAsegurado(Persona persona) {
		this.asegurados.add(persona);
		
	}

}
