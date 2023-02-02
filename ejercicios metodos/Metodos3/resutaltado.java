package Metodos3;
public class resutaltado {
	public static String nota(int x) {
		String valor = "";
	if(x<4) {
		 valor=("Tu nota es insuficiente");
		 
	}else if(x == 5){
		valor=("Tu nota es suficiente");
	}else if (x ==6) {
		valor=("Tu nota es bien");
	}else if(x == 7 || x == 8 ) {
		valor=("Tu nota es notable");
	}else if (x == 9 || x == 10) {
		valor=("tu nota es sobresaliente");
	}
	return valor;
	
	
	}
}

