package Metodos5;
import java.util.Scanner;
public class inicio {
	public static void main(String[] args){
		Base Datos =new Base();
		Scanner s = new Scanner (System.in);
	System.out.println("Porfavor coloque el usuario");
	String usuario = s.nextLine();
	String respuesta = Datos.verificacion1(usuario);
	System.out.println(respuesta);
	System.out.println("Porfavor coloque la contraseña");
	String contraseña = s.nextLine();
	String respuesta2 =Datos.verificacion2(contraseña);
	System.out.println(respuesta2);
	
	
	}

}

