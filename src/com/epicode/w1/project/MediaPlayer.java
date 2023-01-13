package com.epicode.w1.project;

public abstract class MediaPlayer {
	
	private String title;
	public int isImage;

	public MediaPlayer(String title) {
		this.title = title;
		
	}
	
	public void play() {};
	
	public void show() {}

	
	

	public String getTitle() {
		return title;
	}
	
	

	
	

		
}
