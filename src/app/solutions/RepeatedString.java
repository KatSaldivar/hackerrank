package app.solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n) {
        //count the As in s
        int aCount = 0;
        String[] letters = s.split("");
        for(String letter:letters){
            if (letter.equals("a")){
                aCount++;
            }
        }
        //count how many s to reach n and get the remainder 
        long sRepetitions = n/s.length();
        long remainder = n%s.length();

        //multiply the counts and determine remainders
        long count = aCount * sRepetitions;
        for(int i=0; i<remainder; i++){
            if(letters[i].equals("a")){
                count++;
            }
        }
        return count;

       /* //repeat string until length ==n
        StringBuilder string= new StringBuilder();
        while(string.length()<n){
            string.append(s);
        }
        //split into arr and count for letter a
        String[] letters = string.toString().split("");
        int count = 0;
        for(String letter:letters){
            if (letter.equals("a")){
                count++;
            }
        }
        return count;*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
