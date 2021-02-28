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
