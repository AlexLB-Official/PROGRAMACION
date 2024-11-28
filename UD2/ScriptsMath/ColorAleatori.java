import java.awt.Color; 
import javax.swing.*;
     
public class ColorAleatori {
    	
    	private static final int LIMIT = 256;
	public static void main(String[] args) throws InterruptedException
        { 
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(500,500);

		while (true)
		{ 
			// Generar colors RGB aleatoris
			int red = (int) (Math.random()*255+1);    // Valor roig entre 0 i 255 
			int green = (int)  (Math.random()*255+1);  // Valor verd entre 0 i 255 
			int blue = (int) (Math.random()*255+1);   // Valor blau entre 0 i 255  
		       
		      // Crear un objecte Color
		      Color randomColor = new Color(red, green, blue); 
		       
		      // Mostrar el color aleatori 
		      System.out.println("Color aleatori: " + randomColor); 
		      System.out.println("RGB: (" + red + ", " + green + ", " + blue + ")"); 
		      jf.getContentPane().setBackground(randomColor);
		      Thread.sleep(2000);
		}
        } 
    } 
