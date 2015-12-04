/**
 *	Fr 4. Dez 16:56:03 CET 2015
 * <p>
 * PR1, WS2015/16
 * <p>
 * Leonard Oertelt
 * Matrikelnummer 1276156
 * leonard.oertelt@stud.hs-hannover.de
 * <p>
 * Julian Opitz
 * Matrikelnummer 1302082
 * julian.opitz@stud.hs-hannover.de
 * <p>
 * -----------------------------------------
 * Programmbeschreibung
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordLengths {

    public static void main(String[] args) {
        String fileName = null;
        if (args.length > 0) {
            fileName = args[0];
        } else {
            throw new IllegalArgumentException("Es wurde keine Datei angegeben");

        }
	System.out.println("\""+fileName+"\"");
        wordLengths(fileName);

    }

    public static void wordLengths(String fileName) {
        File f = new File(fileName);
	Scanner read = null;
        try {
            read = new Scanner(f);

            int count = 0;
            while (read.hasNextLine()) {
                count++;
                int numTokens = countTokensInString(read.nextLine());
                System.out.print(count + ": " + numTokens + "\t");
                printStars(numTokens);
            }


        } catch (FileNotFoundException error) {
            System.out.println("Datei existiert nicht");
        }
    }

    public static int countTokensInString(String line) {
        Scanner readLine = new Scanner(line);
        int cnt = 0;
        while (readLine.hasNext()) {
		readLine.next();
            cnt++;
        }
        return cnt;
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
