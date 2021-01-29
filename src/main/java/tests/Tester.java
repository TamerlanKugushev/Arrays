package tests;

import java.util.Random;

public class Tester {
    public static int[][] GenerateArr(int[][]arr) {
        Random random = new Random();
        int diff = Integer.MAX_VALUE - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(Integer.MAX_VALUE - 1);
            }
        }
        return arr;
    }
}
