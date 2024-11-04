//1) Create the fibonacci sequence
//2) Filter out to only use the even numebers
//3) Find the sum of the even vauled numbers whose values do not
//      exceed four million

import java.util.ArrayList;

public class EvenFiboDraft{

    public static double a = 1;
    public static double b = 2;
    public static double c = a + b;
    public static long even_sum = 0;

    public static void even_fibb() {
        // ArrayList goldenRatio = new ArrayList<double>(0.0);

        for(int i = 0; i < 4000; i++) {
            // System.out.println("i: " + i);
            
            if (even_sum > 4000000) {
                break;
            }
            if (c % 2 == 0) {
                even_sum += c;
            }  
            if (i == 2) {
                even_sum += 2;
            } 
 
            c = a + b;
            a = b;
            b = c;
            // goldenRatio.sum(even_sum);
            // System.oussum);
        }
        
        System.out.println("even_sum: " + even_sum);
    }
    
/*-------- attempting to use a regular array
    public static int[] test() {
        int[] intArray = new int[3];
        for( int i = 0; i < intArray.length; i ++) {
            intArray[i] = i + 1;
            System.out.println("index : " + i + " ,value: " +intArray[i]);
        }
        return intArray;
    }----------------------------*/

    public static void main(String[] args){
        System.out.println("Three axes to fall");
        even_fibb();
        // int[] intArray;
        // intArray = test();
        // System.out.println("array length: " + intArray.length);
    }


}   