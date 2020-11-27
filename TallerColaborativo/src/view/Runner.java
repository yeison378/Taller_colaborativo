package view;

import javax.swing.JOptionPane;

import model.Management;

public class Runner {
	
	/**
	 * Metodo que permite visualizar el menu y gestionar las opciones 
	 */
	public void menu() {
		
		String palabra = "sogamoso ciudad del sol y del acero";
		Management obj = new Management(palabra);
		String b = "";
		boolean continuar = true;
		while(continuar == true) {
		String mensaje = JOptionPane.showInputDialog("MENU\n"	
				                               +"1.  Ver Cadena Original\n"
				                               +"2.  Convertir en nombre propio\n"
				                               +"3.  Buscar palabra\n"
				                               +"4.  Encriptar Cadena\n"
			                                   +"5.  Desencriptar Cadena\n"
				                               +"6.  Llenar Caracteres\n"
				                               +"7.  Borrar Caracteres\n"
				                               +"8.  Interseccion\n"
				                               +"9.  Diferencia\n"
				                               +"10. Borrar caracteres izquierda o derecha\n"
				                               +"11. Convertir a Fecha\n"
				                               +"12. Salir de la App\n"
				                               +"      Digite una opción: ");
		int opcion = Integer.parseInt(mensaje);
		switch(opcion) {
		case 1:
			JOptionPane.showMessageDialog(null, "Cadena : "+ palabra);
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Mayusculas :" + obj.ownName());
		break;	
		case 3:
			String word = JOptionPane.showInputDialog("Ingrese la palabra que desea buscar: ");
			JOptionPane.showMessageDialog(null, "La palabra " + word + " se encuentra " + obj.findWord(word) + " veces");
		break;
		case 4:
			b = Management.encrypt(obj.ownName());
			JOptionPane.showMessageDialog(null, "Encriptada :" + b);
		break;	
		case 5:
			JOptionPane.showMessageDialog(null, "Desencriptada :" + Management.decrypt(b));
		break;	
		case 6:
			String charr = JOptionPane.showInputDialog("Ingrese el caracter que desea agregar a la cadena");
			char character = charr.charAt(0);
		    int limit = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de veces a agregar")));
		    int address = (Integer.parseInt(JOptionPane.showInputDialog("Seleccione la dirección \n"
					+ "1. Izquierda \n"
					+ "2. Derecha")));
			
		    JOptionPane.showMessageDialog(null, obj.fillCharacters(character, limit, address));
		break;	
		case 7:	
			String characterDelet = JOptionPane.showInputDialog("Ingrese el caracter a eliminar");
			char characterDelete = characterDelet.charAt(0);
			JOptionPane.showMessageDialog(null, obj.deleteCharacter(characterDelete));
		break;		
		case 8:
			JOptionPane.showMessageDialog(null, "Interseccion :" + obj.intersection("colombia"));
		break;	
		case 9:
			JOptionPane.showMessageDialog(null, "Diferencia :" + obj.difference("colombia"));
		break;	
		case 10:
			String chaincharacters= JOptionPane.showInputDialog("Ingrerse la cadena (palabra) de caracteres que se va a comparar\n para la eliminar caracteres iguales");
			int addressDelete = (Integer.parseInt(JOptionPane.showInputDialog("Seleccione la dirección \n"
					+ "1. Izquierda \n"
					+ "2. Derecha")));
			JOptionPane.showMessageDialog(null, obj.deleteComparing(chaincharacters,  addressDelete));
		break;
		case 11:
			String date= JOptionPane.showInputDialog("Ingrese una fecha en formato dd/mm/yyyy");
			JOptionPane.showMessageDialog(null, obj.date(date));
		break;
		case 12:
			continuar = false;
			JOptionPane.showMessageDialog(null, "Fin de la App, Bye");
		break;	
		default: JOptionPane.showMessageDialog(null, "Opción no Valida");
		break;
		}//fin switch
		
		}//fin while
		
	}//fin menu()


	/**
	 * Metodo que permite ejecutar el programa
	 */
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.menu();
	}

}

