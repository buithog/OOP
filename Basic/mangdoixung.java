package Basic;

import java.util.Scanner;

public class mangdoixung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while( t --> 0){
            int n= sc.nextInt();
            int []a =new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int l=0,r=n-1,ok=1;
            while(l<r){
                if(a[l] != a[r] ) {
                    ok=0;
                    System.out.println("NO");
                    break;
                }
                l++;r--;
            }
            if(ok == 1 ) System.out.println("YES");
        }
        sc.close();
    }
}
