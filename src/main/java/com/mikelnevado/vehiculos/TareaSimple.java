package com.mikelnevado.vehiculos;

public class TareaSimple {

	public String titulo;
	protected Boolean completada;
	public Integer tiempo;

	public TareaSimple() {
		this.titulo = null;
		this.completada = false;
		this.tiempo = 0;
	}

	public TareaSimple(String titulo, Boolean completada, Integer tiempo) {
		this.titulo = titulo;
		this.completada = completada;
		this.tiempo = tiempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean isCompletada() {
		return completada;
	}

	public void setCompletada(Boolean completada) {
		this.completada = completada;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}

	public void mostrarTarea() {
		String completado = isCompletada() ? "La tarea ha sido completada" : "La tarea no ha sido completada";
		System.out.println(completado);
	}
	
	public void cambiarEstado() {
		this.completada = !completada;
	}
	

}
