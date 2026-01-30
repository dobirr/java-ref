package de.dennis.javaref.uni.exercises.adhoc.l1.a5;

import java.util.Arrays;

public class PrintStairway {

    public static void main(String[] args) {
        PrintStairway s = new PrintStairway();
        int[][] stairway = s.buildStaiway();

        s.printStairway(stairway);
    }

    int[][] buildStaiway() {
        int[][] stairway = new int[10][];

        for(int i = 0; i < stairway.length; i++) {
            stairway[i] = new int[i + 1];
            for(int j = 0; j <= 9; j++) {
                if(j <= i) {
                    stairway[i][j] = j + 1;
                }
            }
        }

        System.out.println(Arrays.deepToString(stairway));

        return stairway;
    }

    void printStairway(int[][] stairway) {
        for (int[] step : stairway) {
            for (int value : step) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}