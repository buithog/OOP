package Basic;

import java.util.Scanner;

public class uocsonguyentolonnhat {
    public static long nt(long n){
        long res = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i == 0){
                res = i;
                n /= i; 
            }
        }
        if(n != 1) return n;
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            System.out.println(nt(n));
        }
        sc.close();
    }
    
}
