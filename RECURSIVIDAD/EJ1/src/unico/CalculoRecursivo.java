package unico;

public class CalculoRecursivo {
	
	public static void main(String[] args) {
		// VARIABLES
		double a;
		int n;
		double r;
		a = Util.leerLineaDouble("Introduzca base");
		n = Util.leerLineaInt("Introduzca exponente");
		r = elevarRecursivo(a,n);
		System.out.println(r);
	}

	static double elevarRecursivo(double a, int n) {
		double res;
		if (a==0) {
			res = 0;
			return res;
		}else if (n==0) {
			res = 1;
			return res;
		}else {
			res = Math.pow(a, n);
			return res; 
		}
	}
}