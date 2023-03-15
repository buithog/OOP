package Basic;

import java.util.Scanner;

public class solienke {
    public static boolean check(long n){
        while(n>0){
            long tmp=n%10;
            n/=10;
            if(Math.abs(n%10 - tmp) != 1) return false;
            n/=10; 
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
