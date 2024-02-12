//1) Create the fibonacci sequence
//2) Filter out to only use the even numebers
//3) Find the sum of the even vauled numbers whose values do not
//      exceed four million

public class EvenFibo{

    public static void main(String[] args){

// varibles and fields
        double a = 1;
        double b = 2;
        double c = a + b;
        double d = 0;
     
        double i = 10;
        System.out.println("Three axes to fall");
        //for loop
        //statement 1 sets variable; statement 2 defines conditons/ statement 3 increments the value
        for(i = 0; i < 10; i++)
        {
     
            System.out.println("i: " + i);
            
            c = b;
            d = c + b;
            System.out.println()


            // System.out.println("a: " + a +"b: " + b);
            // c = a + b;
            // System.out.println("c : " + c);
            // b = c;
            // System.out.println("b: " + b);
            // d = c + b;
            //--------------//
            // System.out.println("c: " + c);
            System.out.println("d: " + d + " \n"); 
        }




    }
}   