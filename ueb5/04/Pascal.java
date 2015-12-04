import java.util.Scanner;

public class Pascal {
	private static final String PROMPT = "Wieviele Zeilen? ";

	public static void main(String[] args) {
		int rows = getRowsFromUser();
		int[][] pascal = getPascalTriangle(rows);
		printArray(pascal);
	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int getRowsFromUser() {
		Scanner c = new Scanner(System.in);
		System.out.print(PROMPT);
		return c.nextInt();
	}

	private static int[][] getPascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {

		}
		return null;
	}

}
