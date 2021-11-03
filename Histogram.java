package ex4;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.imageio.ImageIO;

import rgbeditor.RGBEditor;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] level = new int[256];
		double mean = 0;
		double std = 0;
		for(int k=0;k<=255;k++) {
			
			level[k] = 0;
			
		}
			
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the corresponding path to your input image:\n");  
		String str= sc.nextLine();  
		File f = new File(str);
		BufferedImage bi = null;
		
		try {
			bi = ImageIO.read(f);
		}
		catch (IOException e) {
			
		}
	
		int w = bi.getWidth(); // la largeur de l'image
		int h = bi.getHeight(); // Sa hauteur
		int min = 0;
		int max = 0;
		for(int i=0; i<w; i++){
		for(int j=0; j<h; j++){
		int rgb = bi.getRGB(i,j); /* Accéder au pixel (i, j) */
		RGBEditor rgbObj =  new RGBEditor(rgb);
        int[] rgbArray = rgbObj.getRGBArray();
        int pixel_value = rgbArray[0];
		
		level[pixel_value] = level[pixel_value] + 1;
		
		mean = mean + pixel_value;
		if (pixel_value < min) {
			min = pixel_value;
		}
		if (pixel_value > max) {
			max = pixel_value; 
		}
		
		}
		}
		for(int i=0; i<w; i++){
			for(int j=0; j<h; j++){
			int rgb = bi.getRGB(i,j); /* Accéder au pixel (i, j) */
			RGBEditor rgbObj =  new RGBEditor(rgb);
	        int[] rgbArray = rgbObj.getRGBArray();
	        int pixel_value = rgbArray[0];
			
			std = std + (pixel_value - mean)*(pixel_value - mean);
			
			}
			}
		 std = std/w*h;
		
		
	    for(int k=0;k<=255;k++) {
			
    		System.out.print("frequency of grayscale level : "+k+" is "+level[k]+"\n");  

			
		}
        mean = mean /w*h;
        System.out.print("minimum pixel value "+min+" maximum pixel value "+max+" \n"); 
        System.out.print("pixels mean : "+mean+"\n");
        System.out.print("pixels std : "+std+"\n");
}
	
	
	}


