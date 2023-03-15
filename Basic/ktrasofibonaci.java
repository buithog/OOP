package Basic;

import java.util.Scanner;

public class ktrasofibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        while (t-- > 0) {
            long n = sc.nextLong();
            int ok = 1;
            for (int i = 0; i <= 92; i++) {
                if (n == f[i]) {
                    System.out.println("YES");
                    ok = 0;
                    break;
                }
            }
            if (ok == 1) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}