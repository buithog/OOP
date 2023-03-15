package Basic;

import java.util.Scanner;

public class SNTt {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long  n = sc.nextLong();
            if( nt(n) == 1 ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static int nt(long n) {
        if(n < 2 ) return 0;
        for(int i=2 ;i<=Math.sqrt(n);i++){
            if(n % i == 0 ) return 0;
        }
        return 1;
    }
}
