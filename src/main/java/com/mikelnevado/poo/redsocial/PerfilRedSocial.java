package com.mikelnevado.poo.redsocial;

public class PerfilRedSocial {

	// Attributes

	private String userName;
	private boolean visibleName;
	private String bio;
	private String place;
	private int followerCount;
	private int postsCount;
	private boolean profileState;
	private boolean verifiedAccount;

	// Fielded constructor
	public PerfilRedSocial(String userName, boolean visibleName, String bio, String place) {
		super();
		this.userName = userName;
		this.visibleName = visibleName;
		this.bio = bio;
		this.place = place;
		this.profileState = true;
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
		return postsCount;
	}

	public void setPostsCount(int postsCount) {
		this.postsCount = postsCount;
	}

	public boolean isProfileState() {
		return profileState;
	}

	public void setProfileState(boolean profileState) {
		this.profileState = profileState;
	}

	public boolean isVerifiedAccount() {
		return verifiedAccount;
	}

	public void setVerifiedAccount(boolean verifiedAccount) {
		this.verifiedAccount = verifiedAccount;
	}


	//Methods
	
	public void showInfo() {
		System.out.println(getUserName());
		System.out.println(getFollowerCount());
		System.out.println(getBio());
		System.out.println(getPostsCount());
	}
	
	
	
	
}
