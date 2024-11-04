/** Create global ArrayList objs factors & primes

/** #1) Getting Cary Sample framework to work for int variable 50 */

/** #4) Modify Arraylist<Double> with the added number 
 *      if divisible by previous number: not prime
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LargestPrime {
    /**
     * Creates an ArrayList that to store the factors of test number
     * Iterates using for loop to determine if the factors are divsible
     * A    dd divible factors to the array list
     * <ul>
     * <li>Correct implementation isFactor(); method 09262024</li>
     * <li>Adding a counter for the number of iterations completed</li>
     * <li>Simpiflied isFactor(){};<li>
     * </ul>
     * Modify isFactor to run more prime numbers.
     * 
     * TODO rename isFactor method to getFactors
     */
    public static ArrayList<Double> isFactor(double x) {
        
        // define an ArrayList as an object
        var facts = new ArrayList<Double>();
        Double counter = 0.0;
        if(x % 2 == 0 ){
            facts.add(2.0);
        }
        for(double i = 0.0; i <= x / 2; i++){
            ++counter;
            // CaryLogger.LOG(x + " / " + i + " == " +
            //     x / i + " r" + (x % i));

            /**loging the divison of factors */
            System.out.print("x: " + x + " % " + "i: " + i);
            System.out.println(" == r" +  x % i);

            if(x % i == 0) {
                System.out.println("factors: " + i);    
                facts.add(i);
            }
        }

        System.out.println("counter: " + counter);
        // CaryLogger.LOG("counter: " + counter);
        // Collections.sort(facts);
        return facts;
    }

    /** #3) isPrime method(){};
         * - Iterates through the arraylist to determining which factors
         *      using previous factor to determine if newest added 
         *      number is prime.
         * - After adding a factor divide my the previous number in the ArrayList;
         *      - If evenly divisable then the number is not prime.
         *      - If all previous factors are not divisble then the number
         *          is prime.
    */

    public static ArrayList<Double> isPrime(ArrayList<Double> facts,
    double i) {
        // int a = 0;
        // int b = 1;
    
        return facts;
    }

    public static void main(String[] args) {
/**
        CaryTestFramework.processArgs(args);
 */
    
        // Creating a Scanner Obj
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for isFactor: ");
        double testNum = input.nextDouble();
        // Creating an ArrayList    

        // Testing the first method
        System.out.println("It didn't have to be magic");
        var facts = isFactor(testNum);

        System.out.println("facts ArrayList<>() from isFactor(): " 
            + facts);

            // Using an enchanced for loop to see the output of ArrayList
            System.out.println("Testnum: " + testNum);
            // for( var factor : facts) {
            // System.out.println("factors: " + factor);
            // }

            // System.out.println("facts: " + facts);
    }
}

// /**========= CaryFrameWork Start ====================== */
//     static void test() {
//         CaryTestFramework.doTest(2, Arrays.asList(2));
//         CaryTestFramework.doTest(3, Arrays.asList(3));
//         CaryTestFramework.doTest(5, Arrays.asList(5));
//         CaryTestFramework.doTest(10, Arrays.asList(2, 5));
//         CaryTestFramework.doTest(15, Arrays.asList(3, 5));
//         CaryTestFramework.doTest(50, Arrays.asList(2, 5));
//         if (CaryTestFramework.testFailures == 0) {
//             System.out.println("All tests passed!");
//             System.exit(0);
//         } else {
//             System.out.println("Tests failed: " + CaryTestFramework.testFailures);
//             System.exit(1);
//         }
//     }
// }

// class CaryLogger {
//     static boolean DEBUG = true;

//     static void LOG(String msg) {
//         if (DEBUG) {
//             System.out.println(msg);
//         }
//     }
// }

// class CaryTestFramework {

//     static int testFailures = 0;

//     static void processArgs(String[] args) {
//         if (args.length == 1 && args[0].equals("--test")) {
//             System.out.println("Running tests...");
//             CaryLogger.DEBUG = false;
//             LargestPrime.test();
//             throw new IllegalStateException("Test should have exited but did not!");
//         }

//         if (args.length != 0) {
//             System.out.println("Unexpected argument: " + args[0]);
//             System.exit(1);
//         }
//     }
    
//     static void doTest(int input, List<Integer> expected) {
//         System.out.print("Test: " + input + " ... ");
//         try {
//             assertEquals(expected, LargestPrime.isFactor(input));
//         } catch (AssertionError e) {
//             System.out.println("FAILURE");
//             System.out.println(e.getMessage());
//             System.out.println("");
//             ++testFailures;
//             return;
//         }
//         System.out.println("OK");
//     }

//     static void assertEquals(List<Integer> expected, List<Integer> actual) {
//         if (expected.size() != actual.size()) {
//             throwNotEquals(expected, actual);
//         }
//         for (int i = 0; i < expected.size(); ++i) {
//             if (expected.get(i) != actual.get(i)) {
//                 throwNotEquals(expected, actual);
//             }
//         }
//     }

//     static void throwNotEquals(List<Integer> expected, List<Integer> actual) {
//         throw new AssertionError("Lists not equal:" +
//                                "\nExpected: " + showList(expected) +
//                                "\nGot:      " + showList(actual));
//     }

//     static String showList(List<Integer> xs) {
//         String s = "[";
//         boolean first = true;
//         for (var x : xs) {
//             if (first) {
//                 first = false;
//             } else {
//                 s += ",";
//             }
//             s += x;
//         }
//         s += "]";
//         return s;
//     }
// }
      
        // for(int i = 0; i <= factors.length;i++) {
        //     System.out.println("i : " + i);
        // }

/** + Adding to the ArrayList using the add method 
- Testing the add method to the ArrayList
        */
        /**
        facts.add(44.00);
        facts.add(69.00);
        facts.add(420.00);
         */
        
        /**In the tree of a for loop, following Queue in line
         *     order. When the first condition is true, the 
         *     if statement will skip the following statements.
         *     Ex:
         *     if ( x == 1){
         *     }
         * 
         *     else if(x == 1){
         *     }
         *         **Else if statement will be skipped.
         */

        // last touched isFactor for loop line #38 java
        /**9/27/24, line #56 last touched */