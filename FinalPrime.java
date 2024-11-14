/**
 * Create a while loop that:
 *      1) Iterated through a test number finding factors.
 *          - Add factor to ArrayList factors
 *      2) Then divides test number by the most factor.
 *          - Reducing the max number for while loop.
 *      3) Rename factors and primeFactors ArrayList to where
 *              to where factors is primes. And program no longer
 *              displays old prime factors to user.
 * Documentation: 
 *      1) Create a logger class or method that can be turned on/off for debugging.
 *      
 *      2) Make a second version of logger that allows
 *          users to find just the factors of testNum. 
 *          - Possible using a switch case.s
 */
import java.util.Scanner;
import java.util.ArrayList;

public class FinalPrime {


    public static void main(String[] args) {
                
        /** Creation of Scanner obj
         * User input for debugging the code.
         * Create String class object before the double primative
         *   input from user. */
        System.out.println("DanDaDan!");
        boolean debug = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like help debugging the code? \n" + 
            "Enter Y ,Yes or N, No: ");
        String help = input.nextLine();
        help = help.toUpperCase();
        if (help.equals("YES") || help.equals("Y")) {
            debug = true;
        }
        else if (help.equals("NO") || help.equals("N")){
            debug = false;
        }
        System.out.println("debug: " + debug);

        /** User input for finding the largest prime */
        System.out.print("Enter the number for testings, heheheh...: ");
        double testNum = input.nextDouble();        
        double oriNum = testNum;
    
        /**
         * ArrayList for factors and primeFactors
        */
        ArrayList<Double> factors = new ArrayList<>();
        ArrayList<Double> primeFactors = new ArrayList<>();
        primeFactors.add(2.0);
        
        double i = 2.0; // Index value expression
        int l = 0; // Loop index variable

        // Outer loop
        while(i <= testNum) {
            E10Logger.LOG("testNum : " + testNum  +  " / " + i + " == " + 
                testNum % i, debug);
            if(testNum % i == 0) {
                factors.add(i);
                E10Logger.LOG("factors: " + factors.get(l), debug);
                E10Logger.LOG("testNum: " + testNum + " / factor: " + 
                     factors.get(l) + " == " + testNum % factors.get(l) 
                    , debug);
                
                /** testNum divided by factor. */
                testNum = testNum / factors.get(l);
                E10Logger.LOG("New testNum: " + testNum, debug);
            l += 1; /** Goes at the end of the loop, factors index val */ 
            }
        i += 1.0; /** Outer loop iterater variable, factors index expression value */
        } /** Outer while loop end */

        if(oriNum % 2 != 0) {
            primeFactors.remove(0);
        }

        System.out.println("factors: " + factors);
        System.out.println("primeFactors: " + primeFactors);
        } /** main Method */

    } // FinalPrime.java Class file

    /** Creation of the E10Logger class(){} */
    class E10Logger {
        public static void LOG(String str, boolean debug) {
            if (debug == true) {
                System.out.println(str);
            }
        }
    }  /**E10Logger class
    *   commit to git and then create further reduced iterations based
            on the remainder of factors. */  