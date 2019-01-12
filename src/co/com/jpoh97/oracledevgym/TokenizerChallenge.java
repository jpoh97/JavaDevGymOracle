package co.com.jpoh97.oracledevgym;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TokenizerChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner("ThisIsIt,theFinalString,NoBugsProject");

        // In simple words, this symbol “^\\w” means “not a word” and the “*” means that – Occurs zero or more times
        Pattern pattern = Pattern.compile("[^\\w*]");
        sc.useDelimiter(pattern);

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        sc.close();

        /*
        ThisIsIt
        theFinalString
        NoBugsProject
         */
    }
}
