package com.mikelnevado.poo.redsocial;

import java.util.ArrayList;
import java.util.List;

public class MainRedSocial {

	private static void displayProfileDetails(ArrayList<PerfilRedSocial> perfiles) {
		perfiles.forEach(perfilRedSocial -> {
			perfilRedSocial.showInfo();
			perfilRedSocial.showPosts();
			System.out.println("                    ");
		});
	}

	public static void main(String[] args) {

		ArrayList<PerfilRedSocial> perfiles = new ArrayList<>();

		perfiles.add(GeneradorPerfiles.makeProfile("Mokel 1", true, "Hola soy Mokel ", "Madrid"));

		perfiles.add(GeneradorPerfiles.makeProfileWithPosts("Mokel 2", false, "Hola soy Mokel 2", "Berlín", 4));

		perfiles.add(GeneradorPerfiles.makeProfileWithPosts("Mokel 3", true, "Hola soy Mokel 3", "Roma", 3));

		displayProfileDetails(perfiles);

		for (int i = 0; i < perfiles.size(); i++) {
			perfiles.get(i).showInfo();
			perfiles.get(i).showPosts();
			System.out.println("                    ");
		}

		perfiles.get(1).addFollowers(20);
		perfiles.get(2).addPost("Buenos días");
		System.out.println("-------------------------");
		System.out.println("                    ");

		displayProfileDetails(perfiles);
	}

}
