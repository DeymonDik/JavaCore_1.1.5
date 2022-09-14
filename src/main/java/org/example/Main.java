package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] matrix = new int[a][b];
        int[] stb = new int[b];
        int[] sta = new int[a];
        for(int i = 0;i<a;i++)
            for(int j = 0;j<b;j++){
                matrix[i][j] = in.nextInt();
                sta[i] = sta[i] + matrix[i][j];
                stb[j] = stb[j] + matrix[i][j];
            }
        int rA = 0;
        int rB = 0;
        int k = 0;
        for(int i = 0; i<a ; i++)
            for(int j = 0; j<b; j++){
                if(sta[i] == stb[j]) {
                    k++;
                    if(k > 1){
                        System.out.println("ambiguous");
                        return;
                    }
                    rA = i + 1;
                    rB = j + 1;
                }
            }
        if(k == 0){
            System.out.println("none");
            return;
        }
        System.out.print(rA);
        System.out.print(" ");
        System.out.print(rB);
    }
}