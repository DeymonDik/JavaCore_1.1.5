package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] min = new int[a];
        for(int i = 0; i<a; i++){
            int j = in.nextInt();
            min[i] = j;
        }
        Arrays.sort(min);
        System.out.println(min[1]);
    }
}