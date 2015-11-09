/**
 *	Mo 26. Okt 16:33:19 CET 2015
 *
 *	PR1, WS2015/16
 *
 *	Leonard Oertelt
 *	Matrikelnummer 1276156
 *	leonard.oertelt@stud.hs-hannover.de
 * 
 *	Julian Opitz
 * 	Matrikelnummer 1302082
 * 	julian.opitz@stud.hs-hannover.de
 *
 *	-----------------------------------------
 *	Programmbeschreibung
 */
public class Quadratic {
	public static void main(String[] args) {

		quadratic( 1.0, -12.0, 35);
		quadratic( 0.2, -0.8, 0.8);
		quadratic( 1.0, 12.0, 37);
		quadratic( 0.1, 0.6, 0.9);
		quadratic( 0.0, 4.0, 7.0);
		quadratic( 1.0, -4.2, 4.21);

	}
	public static void quadratic(double a, double b, double c) {
		System.out.println("---------");
		if( a == 0.0) {
			System.out.println("a muss ungleich 0 sein");
			return;
		}

		double wurzelInhalt = b*b - 4*a*c;
		wurzelInhalt = Math.round(wurzelInhalt * 1000000000) / 1000000000.0;
		if  (wurzelInhalt < 0.0) {
			System.out.println("Keine reelle Lösung");
			return;
		}

		double x1 = (-1.0*b + Math.sqrt(wurzelInhalt))/(2*a);
		double x2 = (-1.0*b - Math.sqrt(wurzelInhalt))/(2*a);

		System.out.println("1.: = " + Math.round(x1 * 10) / 10.0); 
		if (x1 != x2) {	
			System.out.println("2.: = " + Math.round(x2 * 10) / 10.0);
		}
	}
}
