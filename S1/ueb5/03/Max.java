/**
 *	10.12.2015 15:12:24
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
public class Max {
	private static final String ERR_NUM_OF_ARGS = "Bitte genau 3 Parameter angeben";
	private static final String ERR_ARG_TYPE = "Ungültige Parameter.";
	private static final String OUTPUT = "Maximum: ";

	public static void main(String[] args) {
		if (checkArgs(args)) {
			int[] input = asInt(args);
			int max = getMax(input);
			System.out.println(OUTPUT + max);
		}
	}

	private static int[] asInt(String[] numbers) {
		int[] ret = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			ret[i] = Integer.valueOf(numbers[i]);
		}
		return ret;
	}

	private static int getMax(int[] is) {
		int ret = Integer.MIN_VALUE;
		for (int i = 0; i < is.length; i++) {
			ret = Math.max(ret, is[i]);
		}
		return ret;
	}

	private static boolean checkArgs(String[] args) {
		if (args.length != 3) {
			System.out.println(ERR_NUM_OF_ARGS);
			return false;
		}
		for (int i = 0; i < args.length; i++) {
			try {
				Integer.valueOf(args[i]);
			} catch (NumberFormatException e) {
				System.out.println(ERR_ARG_TYPE);
				return false;
			}
		}
		return true;
	}

}
