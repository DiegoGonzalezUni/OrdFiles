package Model;

import java.io.BufferedReader;
import java.io.FileReader;

public class datos {
	
	public String leertxt(String direccion) {
		String Texto = "";
		try {
			BufferedReader bf=new BufferedReader (new FileReader(direccion));
			String temp = ""; 
			String bfRead; 
			while((bfRead = bf.readLine()) != null) {
				//Hace el cliclo mientras hayan datos
				temp = temp + bfRead; //Guardado Texto del Archivo
			}
			Texto = temp;  
		
	}catch(Exception e) {
		System.err.println("No se encontró nada");
		}
		return Texto;
}
}


	