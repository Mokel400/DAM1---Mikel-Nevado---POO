package com.mikelnevado.poo.redsocial;
import java.time.LocalTime;

public class Publicacion {

	// Attributes

	private String contenido;
	private LocalTime fecha;
	private Integer likes;

	// Fielded constructor

	public Publicacion(String contenido) {
		this.contenido = contenido;
		this.fecha = LocalTime.now();
		this.likes = 0;
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
		System.out.println(getContenido());
		System.out.println(getFecha());
		System.out.println(getLikes());
	}
	
	public void giveLikes() {
		likes++;
	}
	
	public Integer showLikes() {
		return likes;
	}
	
}