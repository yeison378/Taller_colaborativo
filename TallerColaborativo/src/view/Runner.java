package view;

import javax.swing.JOptionPane;

import model.Management;

public class Runner {

	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("funcion");
		System.out.println("Hola mundo");

=======
		System.out.println("taller colab");
>>>>>>> branch 'master' of https://github.com/yeison378/Taller_colaborativo.git
=======
	
		
>>>>>>> branch 'master' of https://github.com/yeison378/Taller_colaborativo.git

		String palabra = "sogamoso ciudad del sol y del acero";
		System.out.println("Entrada :"+palabra);
		Management obj = new Management(palabra);
		System.out.println("Mayusculas :"+ obj.ownName());
		String b = Management.encrypt(obj.ownName());
		System.out.println("Encriptada :"+b);
		System.out.println("Deencriptada :"+Management.decrypt(b));
		System.out.println("Interseccion :"+obj.intersection("colombia"));
		System.out.println("Diferencia :"+obj.difference("colombia"));
	}

}
