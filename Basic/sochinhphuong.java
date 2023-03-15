package Basic;

import java.util.Scanner;

public class sochinhphuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t --> 0){
            long n= sc.nextLong();
            long x = (long)Math.sqrt(n);
            if(x*x == n) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
