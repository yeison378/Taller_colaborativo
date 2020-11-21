package view;

import model.Management;

public class Runner {

	public static void main(String[] args) {
		Management obj = new Management("sogamoso ciudad del sol y del acero");
		System.out.println(obj.ownName());
	}

}
