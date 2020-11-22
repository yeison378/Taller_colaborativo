package view;

import model.Management;

public class Runner {

	public static void main(String[] args) {
		String palabra = "sogamoso ciudad del sol y del acero";
		System.out.println("Entrada :"+palabra);
		Management obj = new Management(palabra);
		System.out.println("Mayusculas :"+obj.ownName());
		String b = Management.encrypt(palabra);
		System.out.println("Encriptada : "+b);
		System.out.println("Deencriptada : "+Management.decrypt(b));
		System.out.println("Interseccion : "+obj.intersection("colombia"));
		System.out.println("Diferencia : "+obj.difference("colombia"));
	}

}
