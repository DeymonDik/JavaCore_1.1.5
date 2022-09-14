package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a1 = in.nextLine();
        String a = a1.substring(0,a1.indexOf(" "));
        String b = a1.substring(a1.indexOf(" ")+1);
        int k = 0;
        int index = -1;
        do {
            index = a.indexOf(b, index+1);
            if(index>-1){System.out.println(index+1);
                k++;}
        }while(index > -1);
        if(k==0)System.out.println(-1);
    }
}