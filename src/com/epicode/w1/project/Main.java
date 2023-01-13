package com.epicode.w1.project;

import java.util.Scanner;

public class Main {

//	TODO
	// chiedere se va bene interfacce
// chiedere se volume e lightness sono parametri o devono essere default
//	chiedere metodo play superclasse che senso ha se facciamo override

	public static void main(String[] args) {
		
		MediaPlayer f1 = null;
		MediaPlayer f2 = null;
		MediaPlayer f3 = null;
		MediaPlayer f4 = null;
		MediaPlayer f5 = null;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Select the type of the file 1/5 you want to add : Image (1), Video(2), Audio(3)");
		int type = scanner1.nextInt();
		switch(type) {
		case 1:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Title Image: ");
			String title = scanner.nextLine();
			
			System.out.println("Lightness Image: ");
			int lightness = scanner.nextInt();
			
			f1 = new Image(title, lightness);
			f1.isImage = 1;
			break;
		case 2:
			Scanner scanner11 = new Scanner(System.in);
			System.out.println("Title Video: ");
			String title1 = scanner11.nextLine();
			
			System.out.println("Duration Video ");
			int time1 = scanner11.nextInt();
			
			System.out.println("Lightness video: ");
			int lightness1 = scanner11.nextInt();
			
			System.out.println("Volume video: ");
			int volume1 = scanner11.nextInt();
			
			f1 = new Video(title1, time1, lightness1, volume1);
			f1.isImage = 0;
			break;
		case 3: 
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("title audio: ");
			String title2 = scanner2.nextLine();
			
			System.out.println("time audio: ");
			int time2 = scanner2.nextInt();
			
			System.out.println("Volume audio: ");
			int volume2 = scanner2.nextInt();
			
			f1 = new Audio(title2, time2, volume2);
			f1.isImage = 0;
			break;
			
		}
		
		//f2---------------------------------------------
		
		System.out.println("Select the type of file 2/5 you want to add:  Image (1), Video(2), Audio(3) ");
		type = scanner1.nextInt();
		switch(type) {
		case 1:
			Scanner scanner = new Scanner(System.in);
			System.out.println("title image: ");
			String title = scanner.nextLine();
			
			System.out.println("Lightness image: ");
			int lightness = scanner.nextInt();
			
			f2 = new Image(title, lightness);
			f2.isImage = 1;
			break;
		case 2:
			Scanner scanner11 = new Scanner(System.in);
			System.out.println("title video: ");
			String title1 = scanner11.nextLine();
			
			System.out.println("time video: ");
			int time1 = scanner11.nextInt();
			
			System.out.println("Lightness video: ");
			int lightness1 = scanner11.nextInt();
			
			System.out.println("Volume video: ");
			int volume1 = scanner11.nextInt();
			
			f2 = new Video(title1, time1, lightness1, volume1);
			f2.isImage = 0;
			break;
		case 3: 
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("title audio: ");
			String title2 = scanner2.nextLine();
			
			System.out.println("time audio: ");
			int time2 = scanner2.nextInt();
			
			System.out.println("Volume audio: ");
			int volume2 = scanner2.nextInt();
			
			f2 = new Audio(title2, time2, volume2);
			f2.isImage = 0;
			break;
			
		}
		
		//f3---------------------------------------------
		System.out.println("Select the type of file 3/5 you want to add:  Image (1), Video(2), Audio(3)");
		type = scanner1.nextInt();
				switch(type) {
				case 1:
					Scanner scanner = new Scanner(System.in);
					System.out.println("title image: ");
					String title = scanner.nextLine();
					
					System.out.println("Lightness image: ");
					int lightness = scanner.nextInt();
					
					f3 = new Image(title, lightness);
					f3.isImage = 1;
					break;
				case 2:
					Scanner scanner11 = new Scanner(System.in);
					System.out.println("title video: ");
					String title1 = scanner11.nextLine();
					
					System.out.println("time video: ");
					int time1 = scanner11.nextInt();
					
					System.out.println("Lightness video: ");
					int lightness1 = scanner11.nextInt();
					
					System.out.println("Volume video: ");
					int volume1 = scanner11.nextInt();
					
					f3 = new Video(title1, time1, lightness1, volume1);
					f3.isImage = 0;
					break;
				case 3: 
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("title audio: ");
					String title2 = scanner2.nextLine();
					
					System.out.println("time audio: ");
					int time2 = scanner2.nextInt();
					
					System.out.println("Volume audio: ");
					int volume2 = scanner2.nextInt();
					
					f3 = new Audio(title2, time2, volume2);
					f3.isImage = 0;
					break;
					
				}
				
				
				//f4---------------------------------------------
				System.out.println("Select the type of file 4/5 you want to add:  Image (1), Video(2), Audio(3)");
				type = scanner1.nextInt();
				switch(type) {
				case 1:
					Scanner scanner = new Scanner(System.in);
					System.out.println("title image: ");
					String title = scanner.nextLine();
					
					System.out.println("Lightness image: ");
					int lightness = scanner.nextInt();
					
					f4 = new Image(title, lightness);
					f4.isImage = 1;
					break;
				case 2:
					Scanner scanner11 = new Scanner(System.in);
					System.out.println("title video: ");
					String title1 = scanner11.nextLine();
					
					System.out.println("time video: ");
					int time1 = scanner11.nextInt();
					
					System.out.println("Lightness video: ");
					int lightness1 = scanner11.nextInt();
					
					System.out.println("Volume video: ");
					int volume1 = scanner11.nextInt();
					
					f4 = new Video(title1, time1, lightness1, volume1);
					f4.isImage = 0;
					break;
				case 3: 
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("title audio: ");
					String title2 = scanner2.nextLine();
					
					System.out.println("time audio: ");
					int time2 = scanner2.nextInt();
					
					System.out.println("Volume audio: ");
					int volume2 = scanner2.nextInt();
					
					f4 = new Audio(title2, time2, volume2);
					f4.isImage = 0;
					break;
					
				}
				
				
				
				//f5---------------------------------------------
				System.out.println("Select the type of file 5/5 you want to add:  Image (1), Video(2), Audio(3)");
				type = scanner1.nextInt();
				switch(type) {
				case 1:
					Scanner scanner = new Scanner(System.in);
					System.out.println("title image: ");
					String title = scanner.nextLine();
					
					System.out.println("lightness image: ");
					int lightness = scanner.nextInt();
					
					f5 = new Image(title, lightness);
					f5.isImage = 1;
					break;
				case 2:
					Scanner scanner11 = new Scanner(System.in);
					System.out.println("title video: ");
					String title1 = scanner11.nextLine();
					
					System.out.println("time video: ");
					int time1 = scanner11.nextInt();
					
					System.out.println("Lightness video: ");
					int lightness1 = scanner11.nextInt();
					
					System.out.println("Volume video: ");
					int volume1 = scanner11.nextInt();
					
					f5 = new Video(title1, time1, lightness1, volume1);
					f5.isImage = 0;
					break;
				case 3: 
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("title audio: ");
					String title2 = scanner2.nextLine();
					
					System.out.println("time audio: ");
					int time2 = scanner2.nextInt();
					
					System.out.println("Volume audio: ");
					int volume2 = scanner2.nextInt();
					
					f5 = new Audio(title2, time2, volume2);
					f5.isImage = 0;
					break;
					
				}
		

		Scanner scanner = new Scanner(System.in);

		int scelta;
		do {
			System.out.println();
			System.out.println("Type a number from 1 to 5 to play a media:");
			scelta = scanner.nextInt();
			switch (scelta) {
			case 1:
				switch(f1.isImage) {
				case 1:
					f1.show();
					break;
				case 0: 
					f1.play();
					break;
				}
				break;
			case 2:
				switch(f2.isImage) {
				case 1:
					f2.show();
					break;
				case 0: 
					f2.play();
					break;
				}
				break;
			case 3:
				switch(f3.isImage) {
				case 1:
					f3.show();
					break;
				case 0: 
					f3.play();
					break;
				}
				break;
			case 4:
				switch(f4.isImage) {
				case 1:
					f4.show();
					break;
				case 0: 
					f4.play();
					break;
				}
				break;
			case 5:
				switch(f5.isImage) {
				case 1:
					f5.show();
					break;
				case 0: 
					f5.play();
					break;
				}
				break;
				default: System.out.println("This file does not exist! choose a file from 1 to 5");;
			}
		} while (scelta != 0);
		
		
	}
}