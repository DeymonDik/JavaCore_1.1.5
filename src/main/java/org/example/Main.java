package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        List l = findPrimeNumbers(a*100);
        System.out.println(l.get((int)(a-1)));
    }

    // generating the list of prime numbers from 2 to the given number
    // using the Sieve of Eratosthenes algorithm
    private static List findPrimeNumbers(long n) {
        // initialize the array with "true", index denotes the numbers from 0 to n.
        boolean[] primes = new boolean[(int)(n + 1)];
        Arrays.fill(primes, true);

        //loop from 2 to x until x*x becomes greater than n
        for (int i = 2; (long) i * i < n; i++) {
            // process if the number is not already marked
            if (primes[i]) {
                // find the multiples and mark them as false
                for (int j = i * i; j <= n; j += i)
                    primes[j] = false;
            }
        }

        // populate the list of prime numbers from the array and return it
        List primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

}