package com.mikelnevado.poo.redsocial;

import java.util.List;
import java.util.ArrayList;

public class PerfilRedSocial {

	// Attributes

	private String userName;
	private boolean visibleName;
	private String bio;
	private String place;
	private int followerCount;
	private EstadoPerfil profileState;
	private boolean verifiedAccount;
	private List<Publicacion> postsList;

	// Fielded constructor
	public PerfilRedSocial(String userName, boolean visibleName, String bio, String place) {
		super();
		this.userName = userName;
		this.visibleName = visibleName;
		this.bio = bio;
		this.place = place;
		this.profileState = EstadoPerfil.COMPLETADO;
		this.verifiedAccount = false;
		this.postsList = new ArrayList<Publicacion>();
	}

	// Setters and Getters

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isVisibleName() {
		return visibleName;
	}

	public void setVisibleName(boolean visibleName) {
		this.visibleName = visibleName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(int followerCount) {
		this.followerCount = followerCount;
	}

	public int getPostsCount() {
		return this.postsList.size();
	}

	public EstadoPerfil isProfileState() {
		return profileState;
	}

	public void setProfileState(EstadoPerfil profileState) {
		this.profileState = profileState;
	}

	public boolean isVerifiedAccount() {
		return verifiedAccount;
	}

	public void setVerifiedAccount(boolean verifiedAccount) {
		this.verifiedAccount = verifiedAccount;
	}

	// Methods

	public void showInfo() {
		System.out.println("Nombre de ususario: " + getUserName());
		System.out.println("Cantidad de seguidores: " + getFollowerCount());
		System.out.println("Bio: " + getBio());
		System.out.println("Cantidad de publicaciones: " + getPostsCount());
	}

	public void addFollowers(int moreFollowers) {
		if (moreFollowers > 0) {
			followerCount += moreFollowers;
		} else {
			System.out.println("La cantidad debe ser mas alta");

			// Hay que pedir otra cantidad distinta
			// addFollowers(moreFollowers);
		}
	}

	public void changeState(EstadoPerfil nuevoEstado) {
		this.profileState = nuevoEstado;
	}

	public EstadoPerfil isActive() {
		return profileState;
	}

	public void addPost(String postText) {
		this.postsList.add(new Publicacion(postText));

	}

	public void showPosts() {
		this.postsList.forEach(p -> p.mostrar());
	}

}
