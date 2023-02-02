package Metodos3;
import java.util.Scanner;
public class Notas1 {
	public static void main (String[] args) {
		resutaltado nota = new resutaltado();
		String resultado;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Porvafor diga que nota ha sacado");
		int valor = s.nextInt();
		
		resultado= nota.nota(valor);
		System.out.println(resultado); 
}
}