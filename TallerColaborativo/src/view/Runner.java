package view;

import model.Management;

public class Runner {

	public static void main(String[] args) {
		String palabra = "sogamoso ciudad del sol y del acero";
		System.out.println(palabra);
		Management obj = new Management(palabra);
		System.out.println(obj.ownName());
		String b = Management.encrypt("A");
		System.out.println("Encriptada : "+b);
		System.out.println("Deencriptada : "+Management.decrypt(b));
	}

}
