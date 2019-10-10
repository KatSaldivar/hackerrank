package app.solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {
    
    // Complete the countingValleys function below.
    public static int countingValleys(int n, String s) {
        int elevationCounter=0;
        int valleys=0;
        int mountains=0;
        String[] letters = s.split("");
        for (String letter:letters){
            if(letter.equals("U")){
                elevationCounter++;
            }else if(letter.equals("D")){
                elevationCounter--;
            }
            if(elevationCounter ==0 && letter.equals("U")){
                valleys++;
            }else if(elevationCounter ==0 && letter.equals("D")){
                mountains++;
            }
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
