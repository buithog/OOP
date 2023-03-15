package Basic;

import java.util.Scanner;


public class Giao2dayso {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m], cnt1 = new int[1000006], cnt2 = new int[1000006];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt1[a[i]] = 1;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            cnt2[b[i]] = 1;
        }
        for (int i = 0; i < 1001; i++) {
            if (cnt1[i] == 1 && cnt2[i] == 1)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
