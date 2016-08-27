package consola;

import java.io.File;

public class App {
	

	public static void main(String[] args) {
		/*
		 * La clase File representa una ruta del SO, 
		 * esta clase nos abstrae del SO que estemos utilizando.  
		 */
		
		//File ruta1 = new File("C:\\windows"); //Hay que escapar la "\" SO Windows sólo
		File ruta1 = new File("C:/windows");  	//Es la manera recomendada "/" 
		
//		Operador ternario para comprobar si es una carpeta
//		String resultado; 
//		resultado = (ruta1.isDirectory()) ? "Es una carpeta" : "No es una carpeta"; 
//		System.out.println(resultado);
		
//		Mediante un if
		if(ruta1.isDirectory()){
			System.out.println("Es una carpeta");
		}else{
			System.out.println("No es una carpeta");
		}
		
//		Mediante un if si es un fichero
		if(ruta1.isFile()){
			System.out.println("Es un fichero");
		}else{
			System.out.println("No es un fichero");
		}
	}
}//fin class consola.App
