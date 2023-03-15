import java.util.InputMismatchException;
import java.util.Scanner;

public class xulingoailuon {
    public static void main(String[] args) {

        int a = 0,b=0;
        while (true) { // loops forever until break
            try { // checks code for exceptions
                Scanner sc = new Scanner(System.in);
                System.out.println("How many racers should" + " participate in the race?");
                a = sc.nextInt();
                sc.nextLine();
                break; // if no exceptions breaks out of loop
            }
            catch (InputMismatchException e) { // if an exception appears prints message below
                System.err.println("Please enter a number! " + e.getMessage());
                continue; // continues to loop if exception is found
            }
        }
        while (true) { // loops forever until break
            try { // checks code for exceptions
                Scanner sc = new Scanner(System.in);
                System.out.println("How many racers should" + " participate in the race?");
                b = sc.nextInt();
                break; // if no exceptions breaks out of loop
            }
            catch (InputMismatchException e) { // if an exception appears prints message below
                System.err.println("Please enter a number! " + e.getMessage());
                continue; // continues to loop if exception is found
            }
        }
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Khong chia duoc cho 0");
        }
    }
}
