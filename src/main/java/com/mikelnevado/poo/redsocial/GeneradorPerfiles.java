package com.mikelnevado.poo.redsocial;
public class GeneradorPerfiles {

	public static PerfilRedSocial makeProfile(String userName, boolean visibleName, String bio, String place) {

		PerfilRedSocial p1 = new PerfilRedSocial(userName, visibleName, bio, place);

		return p1;
	}

	public static PerfilRedSocial makeProfileWithPosts(String userName, boolean visibleName, String bio, String place,
			int postCount) {

		PerfilRedSocial p1 = new PerfilRedSocial(userName, visibleName, bio, place);
		
		for (int i= 0; i < postCount; i++) {
			p1.addPost("Hola " + i);
		
		}
		

		return p1;
	}

}
