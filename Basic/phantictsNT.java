package Basic;

import java.util.Scanner;

public class phantictsNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            for (int j = 2; j < Math.sqrt(n); j++) {
                if (n % j == 0) {
                    int cnt = 0;
                    while (n % j == 0) {
                        cnt++;
                        n /= j;
                    }
                    System.out.print(j + "(" + cnt + ") ");
                }
            } 
            if (n != 1)
                System.out.println(n + "(1)");
            else System.out.println();
            }
        sc.close();
    }
}
