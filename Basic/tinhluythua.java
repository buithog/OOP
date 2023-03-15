package Basic;

import java.util.Scanner;

public class tinhluythua {
    final static int  m = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Long n = sc.nextLong();
            long k = sc.nextLong();
            if (n == 0 && k == 0)
                break;
            else
                System.out.println(power(n, k));
        }
        sc.close();
    }

    public static long power(long  n ,long k){
        
        if( k == 0 ) return 1;
        long x = power(n,k/2);
        if( k%2 == 0 ) return x*x%m;
        return n*((x*x)%m)%m;
    }
}
