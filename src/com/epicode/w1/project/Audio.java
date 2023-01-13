package com.epicode.w1.project;

public class Audio extends MediaPlayer implements Volume{
	
	//	attributes
	private int volume;
	private int time;

	//	 constructor
	
	public Audio(String title, int time,  int volume) {
		super(title);
		this.volume = volume;
		this.time = time;
		
	}
// ----------------------- Getters ---------------------------
//	Getter Volume
	
	@Override
	public int getVolume() {
		
		if (this.volume<0) {
			
	// if volume is negative, the default value will be 0
			this.volume = 0;
		}
		return this.volume;
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
		return ++volume;
	}
	
	@Override
	public int decreaseVolume() {
		return --volume;
	}
	

	//	Method Play with volume per minute
	
	@Override
	public void play() {
		if (getTime() > 0) {
		for (int i = 1; i <= this.getTime(); i++) {
			System.out.printf( "Title: " + this.getTitle()+ " Minute: " + (i));
			System.out.printf(" Volume: ");
			
			for(int j = 0; j < this.getVolume(); j++) {
				System.out.printf("!");
				
			}
			System.out.println();
		} 
		
		} else
		System.out.println("Error: time must be a positive value");
		
	}
	



	
	
	
	
	
}
