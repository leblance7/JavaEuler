/**
 * Create a while loop that:
 *      1) Iterated through a test number finding factors.
 *          - Add factor to ArrayList factors
 *      2) Then divides test number by the most factor.
 *          - Reducing the max number for while loop.
 *      3)
 * Documentation: 
 *      1) Create a logger that can be turned on/off for debugging.
 *      
 *      2) Make a second version of logger that allows
 *          users to find just the factors of testNum. 
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalPrime {

    public static void main(String[] args) {
                
        System.out.println("DanDaDan!");
        /**
         * Creation of Scanner obj for the test number.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for testings, heheheh...: ");
        double testNum = input.nextDouble();        
        double oriNum = testNum;
        /**
         * ArrayList for factors and primeFactors
        */

        ArrayList<Double> factors = new ArrayList<>();
        ArrayList<Double> primeFactors = new ArrayList<>();
        primeFactors.add(2.0);
        /**
         * Creating a wrapper instance of an obj.
         * For the purpose of iterating over prime factors.
         * Trying TypeCasting
         */
        

        /** double to Integer class wrapping 
        * double testDouble = 123.00;
        * int testInt = (int)testDouble;
        * System.out.println("testDouble: " + testInt);
        */
        
        double i = 2.0; // Outer
        int j = 0; // 1st inner loop
        int l = 0; // Outer loop index variable

        // Outer loop
        while(i <= testNum) {
           
            System.out.println("i: " + i);
            if(testNum % i == 0) {
                factors.add(i);
                System.out.println("factors: " + factors.get(l));
                // System.out.println("j:" + j);
                System.out.println("testNum: " + testNum + 
                    "  /  factors.get(l): " + factors.get(l));
                testNum = testNum / factors.get(l);
                System.out.println("New testNum: " + testNum);
       
        // Inner loop
                // j = primeFactors.size() - 1;
                // l += 1;
                // while(j < primeFactors.size()) {
                //     // l is an integer iterator
                //     System.out.println("\tprimeFactors: " + primeFactors);
                //     System.out.println("\tfactors.l: index:" + l + " " + factors.get(l) + " % primefactors.j index:" + j + " " + primeFactors.get(j) + " == " + factors.get(l) / primeFactors.get(j));
                //     System.out.println("ln: " + 75);
                //     if (factors.get(l) % primeFactors.get(j) != 0) {
                //         primeFactors.add(factors.get(l));

                //     }
                //     j += 1;
                //     break;
                // }

            l += 1; // Goes at the end of the loop 
            }
        i += 1.0; // Outer loop iterater variable
        } // Outer while loop end

        
        if(oriNum % 2 != 0) {
            primeFactors.remove(0);
        }
        System.out.println("factors: " + factors);
        System.out.println("primeFactors: " + primeFactors);
        } // main Method

    } // Class file

    /**
     * Finding the conversion of the the outer loop i iterator to
     *      to j int for returing the Factor ArrayList.
     */

    /** Creation of the E10Logger class(){}
     ===============================================
     */

    // class E10Logger {
        
    //     static boolean debug = true;

    //     public static void LOG(String str) {
    //         if (debug) {
    //             System.out.println(str);
    //         }
    //     }
    // }


