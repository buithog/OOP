package Basic;

import java.util.Scanner;

public class sapxepchon {
    public static void sapxep(int[] a, int n) {
        int t = 1;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[minpos] > a[j])
                    minpos = j;
            }
            int tmp = a[i];
            a[i] = a[minpos];
            a[minpos] = tmp;
            System.out.print("Buoc " + t + ": ");
            for (int j = 0; j < n; j++)
                System.out.print(a[j] + " ");
            System.out.println();
            t++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sapxep(a, n);
        sc.close();
    }

}
