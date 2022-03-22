package util;

import java.io.*;

public class Input {

    static BufferedReader stdin =
            new BufferedReader(new InputStreamReader(System.in));

    public static String row() {
        String value =null;
        boolean ok;
        do {
            try {
                value = stdin.readLine();
                ok = true;
            } catch (Exception e) {
                System.out.println("Error reading line. Please try again.");
                ok = false;
            }
        }
        while (!ok);
        return value;
    }

    public static char input() {
        String row = row();
        try {
            return row.charAt(0);
        } catch (Exception e) {
            return ' ';
        }
    }
}