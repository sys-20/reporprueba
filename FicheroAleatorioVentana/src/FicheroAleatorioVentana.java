import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;

public class FicheroAleatorioVentana {

	public static void main(String[] args) throws IOException {
		
		JFrame f = new JFrame("DEPARTAMENTOS.");
		// Nos aseguramos que el fichero exista para evitar posibles errores
		RandomAccessFile file;
		file = new RandomAccessFile(new File("AleatorioDep.dat"), "rw");	
		file.close();
		
		VentanaDepart v = new VentanaDepart(f);
		v.setVisible(true);
	   
	}//fin main

	
}//fin class
