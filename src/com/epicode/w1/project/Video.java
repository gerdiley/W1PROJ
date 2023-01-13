package com.epicode.w1.project;

public class Video extends MediaPlayer  implements Volume, Lightness{
	private int volume;
	private int time;
	private int lightness;

	public Video(String title, int time, int volume, int lightness) {
		super(title);
		this.lightness = lightness;
		this.volume = volume;
		this.time = time;
		
	}
	
// ----------------------- Getters ---------------------------
	
//	Getter Volume
	
	@Override
	public int getVolume() {
		if(volume<0) {
			// if volume is negative, the default value will be 0
			this.volume = 0;
		}
		return volume;
	}
	
//  Getter Lightness
	
	@Override
	public int getLightness() {
		
		if (lightness < 0) {
			lightness = 0;
		}
		
		return lightness;
	}
	
public int getTime() {
		
		if(time<0) {
			System.out.println("Error: time must be a positive value");
		}
		return time;
	}
	
//	------------------------- Methods ---------------------

	@Override
	public int increaseVolume() {
		
		return  ++volume;
	}

	@Override
	public int decreaseVolume() {
		
		return --volume;
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
	public void play() {
		if (getTime() >0) {
		for (int i = 1; i <= this.getTime(); i++) {
			System.out.printf( "Title: " + this.getTitle() + " Minute: " + (i));
			System.out.printf(" Volume: ");
			
			for(int j = 0; j < this.getVolume(); j++) {
				System.out.printf("!");
			}
			
			System.out.printf(" Lightness: ");
			
			for(int c = 0; c < this.getLightness(); c++) {
				System.out.printf("*");
			}
			
			
			System.out.println();
		} 
		
		} else
			System.out.println("Error: time must be a positive value");
		
	}
	

	
	




	
	
	
	
}
