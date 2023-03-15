package Basic;

import java.util.Scanner;

public class diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0, sum2 = 0;
            int res = -1;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            for (int i = 0; i < n; i++) {
                sum2 += a[i];
                sum -= a[i];
                if (sum2 - a[i] == sum) {
                    res = i + 1;
                    break;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
