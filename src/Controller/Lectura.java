package Controller;
import java.io.*;
import java.util.*;

import Model.datos;
import Model.escribirtxt;

import java.io.File;
import java.io.FileWriter;
public class Lectura {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		datos a = new datos();
		System.out.println("Archvio no Ordenado:");
		String sl = a.leertxt("src/view/archivo.txt");
		System.out.println(sl);
		System.out.println("Archvio Ordenado:");
		escribirtxt b = new escribirtxt();
		String ol = b.escribirtxt("src/view/nuevotxt.txt");
	}
}
		/*
		ArrayList<String> lista = new ArrayList<String>(); 
		String linea;
		
		try{
			String nombre = "src/view/archivo.txt";
			File archivo = new File(nombre);
			FileReader lector = new FileReader(archivo);
			sc = new Scanner(lector);
			while(sc.hasNextLine()){ 				// hasNext ---> booleano ¿hay algun caracter adelante?
			//Archivo leído y agregado a un ArrayList de tipo String
				linea=sc.nextLine();
				lista.add(linea);					// se carga los datos recogidos en array
			}
			//Pasar los valores del ArrayList (son de tipo String) al arreglo de enteros
			int c;
			int arreglo[]=new int[lista.size()];			
			System.out.print("\nElementos del archivo:\n");
			for(int i=0; i<lista.size(); i++){  	// recorrido del array
				c=Integer.parseInt(lista.get(i)); 	// conversion de string a integer
				arreglo[i]=c;
				System.out.print(arreglo[i]+"\n");
			}
			
			//Ordenar los números del arreglo por insercion
			System.out.print("\nSALIDA (En forma Ascendente):\n");
			int pos,aux;
			for(int i=0;i<lista.size();i++){ 		// para ordenar s utilizan 2 variables pos y aux
				pos = i; 							// indica la posisicion 
				aux = arreglo[i]; 					// elemento del arreglo actual que se comprueba
			while((pos>0) && (arreglo[pos-1] > aux)){ // verificar que no se este en la posicion 0 y que el numero de la izq sea mayor 
			arreglo[pos] = arreglo[pos-1];			// si es > se cambia el numero actual por el de la izq
			pos--;									// se va comprobar hasta la posicion 1
			}
			arreglo[pos] = aux;						// se actualiza el numero actual
			}

			System.out.print("\norden Ascendente: ");
			// creacion del archivo txt con los datos ordenados
			File archivonew=new File("ordenado.txt");
			FileWriter fichero = new FileWriter("src/view/nuevotxt.txt");

			for(int i=0;i<lista.size();i++) { 		// recorrido del arrego con los datos ordenados
				
			System.out.print(arreglo[i]+" - "); 	// impresion de los datos del arreglo
			fichero.write(arreglo[i]+" - "); 		// datos cargados en el archivo txt
			}
			fichero.close();
		}
		catch(FileNotFoundException e){
			System.out.print("Archivo no encontrado"); //mensaje si no encuentra el archivo con la informacion a ordenar
		}
	}
	*/
