/**
 *	10.12.2015 15:13:23
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
 */
public class VergleichArrays {

	static public boolean kleinerGleich(int[] a, int[] b) {

		return isEmpty(a) || firstShorterOrEqualLengthAndEveryElementSmallerOrEquals(a, b)
				|| firstLongerButEveryIndexSmallerOrEqualsAndOneSmaller(a, b);
	}

	static private boolean firstLongerButEveryIndexSmallerOrEqualsAndOneSmaller(int[] a, int[] b) {
		if (a.length <= b.length || b.length < 1)
			return false;
		boolean ret = false;
		for (int i = 0; i < b.length; i++) {
			if (b[i] < a[i])
				return false;
			if (a[i] < b[i])
				ret = true;
		}
		return ret;
	}

	static private boolean firstShorterOrEqualLengthAndEveryElementSmallerOrEquals(int[] a, int[] b) {
		if (a.length > b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b[i])
				return false;
		}
		return true;
	}

	static private boolean isEmpty(int[] a) {
		return a.length == 0;
	}
}
