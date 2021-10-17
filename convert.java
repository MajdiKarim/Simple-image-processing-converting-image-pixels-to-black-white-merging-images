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
		String str= sc.nextLine();              //reads string
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
		//System.out.println(bi);
		//BufferedImage ba;
		 // Modification de la couleur du pixel
	     
		
		
		int w = bi.getWidth(); // la largeur de l'image
		int h = bi.getHeight(); // Sa hauteur
		for(int i=0; i<w; i++){
		for(int j=0; j<h; j++){
		int rgb = bi.getRGB(i,j); /* Accéder au pixel (i, j) */
		
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
		try { // l'image lu sera sauvegarder dans un autre fichier
			ImageIO.write(bi, "JPG", new File(processed));
			}
			catch (IOException e) { e.printStackTrace();}
		
		
		
}

}

