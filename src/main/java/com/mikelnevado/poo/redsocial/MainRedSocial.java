package com.mikelnevado.poo.redsocial;

import java.util.ArrayList;


public class MainRedSocial {

	public static void main(String[] args) {
		
		ArrayList<PerfilRedSocial> perfiles = new ArrayList<>();
		
		perfiles.add(GeneradorPerfiles.makeProfile("Mokel 1", true, "Hola soy Mokel ", "Madrid"));
		
		perfiles.add(GeneradorPerfiles.makeProfileWithPosts("Mokel 2", false, "Hola soy Mokel 2", "Berlín", 4));
		
		perfiles.add(GeneradorPerfiles.makeProfileWithPosts("Mokel 3", true, "Hola soy Mokel 3", "Roma", 3));

		
		for (int i = 0; i < perfiles.size(); i++) {
			perfiles.get(i).showInfo();
			perfiles.get(i).showPosts();
		}
		
		perfiles.get(1).addFollowers(20);
		perfiles.get(2).makePost("Buenos días");
		
		for (int i = 0; i < perfiles.size(); i++) {
			perfiles.get(i).showInfo();
			perfiles.get(i).showPosts();
		}
	}

}


