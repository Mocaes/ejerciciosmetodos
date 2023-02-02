package metodos6;

public class geometria_obj{
	
	public double volumenCilindro(double r, double h) {
		return Math.PI *r *r *h;
	}
	
	public double longitudCircunferencia(double r) {
		return 2 * Math.PI * r;
	}
	
	public double volumencubo(double lado) {
		return lado*lado*lado;
	}
}