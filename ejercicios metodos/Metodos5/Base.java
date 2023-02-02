package Metodos5;

public class Base {
	
	public String verificacion1 (String usuario){
	
		String base = "Moca";
		String respuesta;
		if(usuario.equals(base)) {
			respuesta = ("La contraseña es correcta");
		}else {
			respuesta =("La contraseña es incorrecta");
		}
		return respuesta;
	}
	public String verificacion2 (String contraseña) {
		
		String respuesta2;
		if(contraseña.length() <= 8) {
			respuesta2 = ("La contraseña es correcta");
		}else {
			respuesta2 = ("La contraseña demasiado larga");
		}
		return respuesta2;
	}

}
