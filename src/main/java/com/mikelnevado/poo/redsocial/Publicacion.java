package com.mikelnevado.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {

	// Attributes

	private String contenido;
	private LocalTime fecha;
	private Integer likes;

	// Fielded constructor

	public Publicacion(String contenido) {
		super();
		this.contenido = contenido;
		this.fecha = LocalTime.now();
	}

	// Getters and Setters

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public LocalTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalTime fecha) {
		this.fecha = fecha;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
	//Methods
	
	public void mostrar() {
		getFecha();
		getLikes();
	}
	
	public void darMeGusta() {
	likes++;
	}
	
	public int verMeGusta() {
		return likes;
	}
	
}