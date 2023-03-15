package Basic;

import java.util.Scanner;
import java.util.Vector;

public class catdoi {
    public static long  process(long n){
        Vector<Long> a = new Vector<>();
        long res=0;
        while(n>0){
            Long  tmp =  (n%10);
            if(tmp == 1) {
                a.add(tmp);
            }
            if(tmp == 0  || tmp == 8 || tmp == 9) {
                a.add((long) 0);
            }
            if(tmp >1 && tmp <8) return 0;
            n/=10;
        }
        for(int i = a.size() -1;i>=0;i--){
            res = res*10+a.get(i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            if(process(n) == 0) System.out.println("INVALID");
            else System.out.println(process(n));
        }
        sc.close();
    }
}
