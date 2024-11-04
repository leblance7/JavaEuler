
/**
 * 1) Creating a simplied version of prime method to implement
 *      into LargestPrime.java
 * 2) Creation of factors ArrayList<Integer>() for 100
 *      - With Even dividants as well.
 * 3) primeFacts(ArrayList<Integer>() factors, )
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 

public class primes {


    /**
     * 3) primeFactors
     * + Accepts an ArrayList<Interger>() 
     * + Iterates through the ArrayList diving current iteration
     *      by the previous element.
     * int i = element value of i position
     * int x = element value in that position
     * - if (i % x != 0){}
     *      the number is prime
     * - else if
     * 
     */
    public static ArrayList<Integer> primeFactors (ArrayList<Integer>
        factors) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
    // Outter for loop factors<>{};
        System.out.println("primes: " + factors.get(1));
            for (int i = 0; i <= factors.size() - 1; i++) {
                primes.add(factors.get(i));
                System.out.println("primes: " + primes.get(i));
                // System.out.println("primes: " + primes(i));
            System.out.println("primes: " + primes);
            }   
            
        return primes;
        }

    public static void main(String[] args) {
        System.out.println("Thuum!");
        // Initalizing the ArrayList Facts
        ArrayList<Integer> factors = new ArrayList<Integer>();
        // factors.add(1, 2, 4, 5, 10, 20, 25, 50);
        factors.add(1);
        factors.add(2);
        factors.add(4);
        factors.add(5);
        factors.add(10);
        factors.add(20);
        factors.add(25);
        factors.add(50);
        System.out.println("factors index 1: " + 0);
        System.out.println("factors size: " + factors.size());

    /** Calling the primeFactors method */
        var primes =  primeFactors(factors);
        System.out.println(factors.size());

    /**Print statements */
        // System.out.println("factors: " + factors);
        // System.out.println(factors.size());
    
    }
}
/**previous processing in isPrime(){};
        * for(int i = 0; i <= factors.size(); i++) {
            System.out.println("index: " + i);
            if (i == factors.size()) {
                continue;
            }
            else if(i == factors.size() - 1) {
                break;
            }
            else if (factors.get(i) % factors.get(i + 1) != 0) {
                System.out.println(factors.get(i + 1) + " / " + factors.get(i));
                primes.add(factors.get(i));
                System.out.println("factors: " + factors);
            // else if (factors.get(i + 1) % factors.get(i) != 0) {
                /** Remove index val element of factors 
                * 
        */