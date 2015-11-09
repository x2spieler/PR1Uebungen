/**
 *	Mo 26. Okt 16:53:48 CET 2015
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
import java.util.Scanner;

public class Sentinel {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String names = new String();

		while (true) {

			System.out.print("input : ");
			String gelesen = console.nextLine();

			if( gelesen.isEmpty()) break;
			names = names.concat(" " + gelesen);


		}
		System.out.println("Die Namen:" + names);

	}
}
