package Basic;

import java.util.Scanner;

public class tinhtonggiathua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;
        long tmp = 1;
        for (int i = 2; i <= n; i++) {
            tmp = tmp * i;
            res += tmp;
        }
        System.out.println(res);
        sc.close();
    }
}
