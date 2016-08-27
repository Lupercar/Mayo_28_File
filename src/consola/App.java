package consola;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		/*
		 * La clase File representa una ruta del SO, esta clase nos abstrae del
		 * SO que estemos utilizando.
		 */

		// File ruta1 = new File("C:\\windows"); //Hay que escapar la "\" SO
		// Windows sólo
		File ruta1 = new File("C:/windows"); // Es la manera recomendada "/"

		// Operador ternario para comprobar si es una carpeta
		// String resultado;
		// resultado = (ruta1.isDirectory()) ? "Es una carpeta" : "No es una
		// carpeta";
		// System.out.println(resultado);

		// Mediante un if
		if (ruta1.isDirectory()) {
			System.out.println("Es una carpeta");
		} else {
			System.out.println("No es una carpeta");
		}

		// Mediante un if si es un fichero
		if (ruta1.isFile()) {
			System.out.println("Es un fichero");
		} else {
			System.out.println("No es un fichero");
		}

		// Compruebo si existe una carpeta, sino la creo
		File carpetaTemp = new File("C:/Temp");
		if (!carpetaTemp.exists()) {
			carpetaTemp.mkdirs();
			System.out.println("Creada carpeta Temp");
		} else {
			System.out.println("Ya existe carpeta.");
		}

		// Creo fichero
		File fichero1 = new File(carpetaTemp, "fichero1.txt");

		try {
			if (!fichero1.exists())
				fichero1.createNewFile();
				System.out.println("Hemos creado el fichero.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
//		Ejecutar una aplicación
		File notepad = new File("c:/windows/notepad.exe");
		
//		System.out.println(notepad.getAbsolutePath());
//		try {
//			System.out.println(notepad.getCanonicalPath());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		if(notepad.canExecute()){
			try {
				Runtime.getRuntime().exec(notepad.getAbsolutePath());
			} catch (IOException ex) {
				ex.printStackTrace();
			} 
		}
	}
}// fin class consola.App
