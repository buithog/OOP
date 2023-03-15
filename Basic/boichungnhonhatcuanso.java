package Basic;

import java.util.Scanner;

public class boichungnhonhatcuanso {
    public static long GCD(long res,long l){
        if(l == 0 ) return  res;
        return GCD(l,res%l);
    }
    public static long LCM(long res,long b){
        return res*b/GCD(res,b);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long n =sc.nextLong();
            long res=1;
            for(int i = 2;i <= n; i++ ){
                res= LCM(res,i);
            }
            System.out.println(res);
        }
        sc.close();
    }
}
