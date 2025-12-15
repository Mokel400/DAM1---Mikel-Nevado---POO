package com.mikelnevado.poo.redsocial;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Publicacion {

	// Attributes

	private String contenido;
	private String fechaHora;
	private Integer likes;
	
	private static final String FORM_DATE_TIME = "dd-mm-yyyy / HH:MM:ss";

	// Fielded constructor

	public Publicacion(String contenido) {
		this.contenido = contenido;
		this.fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORM_DATE_TIME));
		this.likes = 0;
	}

	// Getters and Setters

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getFecha() {
		return fechaHora;
	}

	public void setFecha(String fecha) {
		this.fechaHora = fecha;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
	//Methods
	
	public void mostrar() {
		System.out.println("Contenido: " + contenido);
		System.out.println("Fecha: " + fechaHora);
		System.out.println("Likes: " + likes);
	}
	
	public void giveLikes() {
		likes++;
	}
	
	public Integer showLikes() {
		return likes;
	}
	
	private String formatTimeDate() {
		return this.fechaHora;
	}
	
}