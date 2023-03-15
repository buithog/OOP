package Basic;

import java.util.Scanner;

public class chuso4va7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        int dem=0;
        while(n>0){
            long tmp = n % 10;
            if(tmp == 4 || tmp == 7) dem++;
            n/=10;
        }
        if(dem == 4 || dem == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
        sc.close();
    }
    
}
