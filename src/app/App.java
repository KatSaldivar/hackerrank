package app;
import app.solutions.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        int pairsOfSocks = SockMerchant.sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20});
        int valleys=CountingValleys.countingValleys(8, "UDDDUDUU");
        int clouds = JumpingOnClouds.jumpingOnClouds(new int[] {0,0,1,0,0,1,0});
        long repeats = RepeatedString.repeatedString("aba", 10);
        System.out.println(repeats);

    }
}