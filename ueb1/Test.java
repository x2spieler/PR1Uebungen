import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(new File(args[0]))) {
			if (!s.hasNextLine())
				System.exit(2);
			s.nextLine();
			DecimalFormat formatter = new DecimalFormat("0000.00");
			while (s.hasNextLine()) {
				String[] tokens = s.nextLine().split(";");
				if (tokens.length < 4)
					break;
				System.out.printf("%-14sist geboren in %4d und liebt %-10s und %7s\n", tokens[0],
						Integer.parseInt(tokens[1]), tokens[2],
						formatter.format(Float.parseFloat(tokens[3].replace(",", "."))));
			}
		} catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
			System.err.println("something happened");
		}
	}
}
