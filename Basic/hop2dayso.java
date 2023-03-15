package Basic;

import java.util.Scanner;

public class hop2dayso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m= sc.nextInt();
        int [] a = new int[n+m], b = new int[1000006];
        for(int i=0;i<n+m;i++){
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        for(int i=0;i<1000006;i++){
            if(b[i] != 0) System.out.print(i +" ");
        }
        sc.close();
    }
}
