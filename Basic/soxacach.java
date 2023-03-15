package Basic;

import java.util.Scanner;

public class soxacach {
    public static void in(int [] a, int n){
        for(int i=1;i<=n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static boolean check(int [] a, int n){
        for(int i=1;i<n;i++){
            if(Math.abs(a[i] - a[i+1]) < 2 )  return false;
        }
        return true;
    }
    public static void Try(int [] a,int [] used , int n, int i){
        for(int j=1;j<=n;j++){
            if(used[j] == 0){
                a[i] = j;
                used[j] = 1;
                if( i == n) {if(check(a,n)) in(a,n);}
                else Try(a, used, n, i+1);
                used[j] = 0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t -- > 0){
            int n = sc.nextInt();
            int [] a =  new int[20];
            int [] b = new int[1000];
            Try(a,b,n,1);
        }
        sc.close();
    }
    
}
