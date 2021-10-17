import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the corresponding path to your input image:\n");  
		String str= sc.nextLine();              
		BufferedImage bi = null;
		System.out.print("Enter the threshold from which the pixel value will change:\n");
		Scanner threshold =new Scanner(System.in); 
		int s = threshold.nextInt();

		File f = new File(str);
		try {
			bi = ImageIO.read(f);
		}
		catch (IOException e) {
			
		}
		
	     
		
		
		int w = bi.getWidth(); 
		int h = bi.getHeight(); 
		for(int i=0; i<w; i++){
		for(int j=0; j<h; j++){
		int rgb = bi.getRGB(i,j); 
		
		if (rgb > s) {
		bi.setRGB(i, j, 255);
		}
		else {
		
		bi.setRGB(i, j, 0);
		
		}
		}
	}
		System.out.print("Enter the corresponding path where to the processed image: will be stored\n");  
		String processed = sc.nextLine();     
		try { 
			ImageIO.write(bi, "JPG", new File(processed));
			}
			catch (IOException e) { e.printStackTrace();}
		
		
		
}

}

