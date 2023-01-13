package com.epicode.w1.project;

public class Image extends MediaPlayer implements Lightness {
	
	private int lightness;
	
	public Image(String title, int lightness) {
		super(title);
		this.lightness = lightness;
	}

	@Override
	public int increaseLightness() {
		// TODO Auto-generated method stub
		return ++lightness;
	}

	@Override
	public int decreaseLightness() {
		// TODO Auto-generated method stub
		return --lightness;
	}

	@Override
	public int getLightness() {
		// TODO Auto-generated method stub
		return lightness;
	}
	
	@Override
	public void show() {
		System.out.printf( "Title: " + this.getTitle() + " Lightness: ");
		for (int i = 1; i <= this.getLightness(); i++) {
				System.out.printf("*");
			} 
	}
	
	

}
