package ex2;

import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import rgbeditor.*;
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
			image2 = ImageIO.read(g);
		}
		catch (IOException e) {
			
		}
		int w = image1.getWidth(); 
		int h = image1.getHeight(); 
		for(int i=0; i<w; i++){
		for(int j=0; j<h; j++){
	
	    int gray1 = image1.getRGB(i,j);
	    RGBEditor rgbObj1 =  new RGBEditor(gray1);
        int[] rgbArray1 = rgbObj1.getRGBArray();
        int pixel_value1 = rgbArray1[0];
	    
	    int gray2= image2.getRGB(i,j);
	    RGBEditor rgbObj2 =  new RGBEditor(gray2);
	    int[] rgbArray2 = rgbObj2.getRGBArray();
        int pixel_value2 = rgbArray2[0];

		if (pixel_value1 > pixel_value2) {
		image1.setRGB(i, j, rgbObj1.getRGBint());
		}
		else {
		
		image1.setRGB(i, j, rgbObj2.getRGBint());
		
		}
		}
		}
		System.out.print("Enter the corresponding path where to the processed image will be stored\n");  
		String processed = sc.nextLine();     
		try { 
			ImageIO.write(image1, "JPEG", new File(processed));
			}
			catch (IOException e) { e.printStackTrace();}
		
		
		
		
		
		
		
		
		
		
	

	}}
