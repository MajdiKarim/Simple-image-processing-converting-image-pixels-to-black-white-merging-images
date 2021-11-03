package ex3;

import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import rgbeditor.*;
public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=0; i<w; i++){
		for(int j=0; j<h; j++){
		int rgb = bi.getRGB(i,j); /* Accéder au pixel (i, j) */
		RGBEditor rgbObj =  new RGBEditor(rgb);
        int[] rgbArray = rgbObj.getRGBArray();
        int pixel_value = rgbArray[0];
        rgbObj = new RGBEditor(255-pixel_value,255-rgbArray[1],255-rgbArray[2],255-rgbArray[3]);
		bi.setRGB(i, j, rgbObj.getRGBint());
		
		}
	}
		System.out.print("Enter the corresponding path where to the processed image: will be stored\n");  
		String processed = sc.nextLine();     
		try { // l'image lu sera sauvegarder dans un autre fichier
			ImageIO.write(bi, "JPG", new File(processed));
			}
			catch (IOException e) { e.printStackTrace();}
		
		
		
}
	
	
	
	
	
	
	
	
	
	}



	
	
	
	
	
	
	
	
	}



