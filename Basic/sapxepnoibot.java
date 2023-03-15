package Basic;

import java.util.Scanner;

public class sapxepnoibot {
    public static void sapxep(int [] a, int n ){
        int k=1,ok;
        for(int i=0;i<n-1;i++){
            ok=0;
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    ok=1;
                    int tmp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(ok == 1){
                System.out.print("Buoc " + k+ ": ");
                k++;
                for(int x:a) System.out.print(x+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        sapxep(a,n);
        sc.close();
    }
    
}
