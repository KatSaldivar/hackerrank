package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import app.solutions.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        /*int pairsOfSocks = SockMerchant.sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20});
        int valleys=CountingValleys.countingValleys(8, "UDDDUDUU");
        int clouds = JumpingOnClouds.jumpingOnClouds(new int[] {0,0,1,0,0,1,0});
        long repeats = RepeatedString.repeatedString("aba", 10);
        System.out.println(repeats);*/
        ReverseWords.reverseWords();
  }

   public void lineReverser(String str){
    String[] words = str.split("\\s+");
    List<String> wordList = Arrays.asList(words);
    Collections.reverse(wordList);
    String[]reversed = wordList.toArray(words);
    System.out.println(String.join(" ", reversed));
  }

};