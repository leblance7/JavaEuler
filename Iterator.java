import java.util.Scanner;

public class Iterator {
    
    public static int modifier(int x) {
        int counter = 1;
        for(int i = 0; i <= 0; i++) {
            counter += 1;
            if( i == 0) {
            }
            else if(x % i == 0) {
                System.out.println("factor: " + i);
            }
        }
        return x;
    }

    public static void main(String args[]) {
        
        // Creating a Scanner obj
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for modifer loop: ");
        int x = input.nextInt();

        int y = modifier(x);


    }
}