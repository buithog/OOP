package Basic;

import java.util.Scanner;

public class tonguocso1 {
    static int[] a = new int[2000005];

    public static void sang() {
        for (int i = 0; i < 2000005; i++)
            a[i] = 1;
        a[0] = a[1] = 0;
        for (int i = 2; i < 2000; i++) {
            if (a[i] == 1) {
                for (int j = i * i; j < 2000005; j += i)
                    a[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        sang();
        while (t --> 0) {
            int n = sc.nextInt();
            int j = 2;
            while (j <= n) {
                if (a[n] == 1) {
                    sum += n;
                    break;
                }

                if (a[j] == 1) {
                    if (n % j == 0) {
                        while (n % j == 0) {
                            sum += j;
                            n /= j;
                        }
                    }
                }
                j++;

            }
        }
        System.out.println(sum);
        sc.close();
    }
}