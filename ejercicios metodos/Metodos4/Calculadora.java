package Metodos4;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Calculo calculo= new Calculo();
    System.out.println("introduce el 1º numero: ");
    int a=s.nextInt();
    System.out.println("introduce el 2º numero: ");
    int b=s.nextInt();

    System.out.println("suma:"+ Calculo.suma(a,b));
    System.out.println("resta:"+ Calculo.resta(a,b));
    System.out.println("producto:"+ Calculo.multiply(a,b));
    System.out.println("division:"+ Calculo.division(a,b));
    System.out.println("raiz" + Calculo.raiz(a,b));
    System.out.println("exponente"+ Calculo.exponente(a,b));

}

}
