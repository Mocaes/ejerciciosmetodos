package Metodos;
import java.util.Scanner;
public class Metodos1 {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		metodos2 ope = new metodos2();
		System.out.print("indica el primer numero: ");
		int a=s.nextInt();
		System.out.print("indica el segundo numero:");
		int b=s.nextInt();
		//invocamos los diferentes metodos
		System.out.println("Suma: "+ope.suma(a,b));
		System.out.println("Resta: "+ ope.resta(a,b));
		System.out.println("Multiplicacion: "+ ope.multiplicacion(a,b));
		System.out.println("Division: "+ ope.division(a,b));
        System.out.println("raiz" +ope.raiz(a,b));
        System.out.println("exponente"+ope.exponente(a,b));

	}
}


