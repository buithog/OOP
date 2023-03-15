package Basic;

import java.util.Scanner;

public class sokhonglienke {
        public static boolean check(long n){
            long tong=0;
            while(n>10){
                long tmp=n%10;
                tong += tmp;
                n/=10;
                if(Math.abs(n%10 - tmp) != 2) return false;
            }
            tong+=n;
            if(tong%10 == 0)
            return true;
            return false;
    
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

