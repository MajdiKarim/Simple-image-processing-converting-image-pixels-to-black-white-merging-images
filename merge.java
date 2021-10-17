import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the corresponding path to your first input image:\n");
		Scanner sc=new Scanner(System.in); 
		String first_image = sc.nextLine(); 
		System.out.print("Enter the corresponding path to your seconds input image:\n");
		String seconds_image = sc.nextLine();
		File f = new File(first_image);
		File g = new File(seconds_image);
		BufferedImage image1 = null;
		BufferedImage image2 = null;
		try {
			image1 = ImageIO.read(f);
		}
		catch (IOException e) {
			
		}
		try {
			image2 = ImageIO.read(f);
		}
		catch (IOException e) {
			
		}
		int w = image1.getWidth(); 
		int h = image1.getHeight(); 
		for(int i=0; i<w; i++){
		for(int j=0; j<h; j++){
		int rgb1 = image1.getRGB(i,j); /* Accéder au pixel (i, j) */
		int rgb2 = image1.getRGB(i,j);
		if (rgb1 > rgb2) {
		image1.setRGB(i, j, rgb1);
		}
		else {
		
		image1.setRGB(i, j, rgb2);
		
		}
		}
		System.out.print("Enter the corresponding path where to the processed image will be stored\n");  
		String processed = sc.nextLine();     
		try { 
			ImageIO.write(image1, "JPG", new File(processed));
			}
			catch (IOException e) { e.printStackTrace();}
		
		
		
		
		
		
		
		
		
		
	}

	}}

