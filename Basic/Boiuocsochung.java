package Basic;

import java.util.Scanner;

public class Boiuocsochung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t --> 0 ){
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(LCM(n,k) + " " + GCD(n,k));
        }
        sc.close();
    }
    public static long  GCD(long a, long b ) {
        if( b == 0 ) return a;
        return GCD(b,a%b);
    }
    public static long LCM( long a , long b ) {
        return a*b/GCD(a,b);
    }
}
