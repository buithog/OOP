package Basic;

import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        float n = sc.nextFloat(), k = sc.nextFloat();
        if( n == k && k == 0) {
            System.out.println("VSN");
        }
        if(n == 0 && k != 0) {
            System.out.println("VN");
        }
        float res;
        if(n != 0 && k != 0){
            res = (-1)*k/n;
            System.out.printf("%.2f",res);
        }
        sc.close();
    }
}
