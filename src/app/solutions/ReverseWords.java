package app.solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void reverseWords() throws IOException {
        System.out.println("How many lines of text do you want to reverse?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if(input.matches("\\d+")){
            int lineCount = Integer.parseInt(input);
            ArrayList<String> wordsArrayList = new ArrayList<String>();
            for(int i=0;i<lineCount; i++){
                wordsArrayList.add(br.readLine());
            }
            String[] wordsArray = new String[wordsArrayList.size()];
            wordsArray=wordsArrayList.toArray(wordsArray);

            for(String line:wordsArray){
                String[] words = line.split("\\s+");
                List<String> wordList = Arrays.asList(words);
                Collections.reverse(wordList);
                String[]reversed = wordList.toArray(words);
                System.out.println(String.join(" ", reversed));
            }
        }else{
            System.out.println("Please enter a number.");
        }
    }
};