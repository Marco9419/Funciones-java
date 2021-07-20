package clases;
import java.util.Scanner;

public class main {


		public static void main(String[] args) {
			
			// TODO autogenerado el metodo 
			Scanner entrada = new Scanner(System.in);
			System.out.print("Ingresa tu nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.println(greetings(nombre));
			entrada.close();
		}
		public static String greetings(String greeting) {
			return "Hola, "+ greeting; 
		}
	}

