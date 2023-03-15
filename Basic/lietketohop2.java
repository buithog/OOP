package Basic;

import java.util.Scanner;

public class lietketohop2 {
    public static int dem =0;
    public static void in(int [] a, int k){
        dem++;
        for(int i=1;i<=k;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    public static void quaylui(int [] a,int n,int k,int i,int dem){
        for(int j = a[i-1] + 1;j<= n - k + i;j++){
            a[i] = j;
            if(i == k) {
                in(a,k);
            }
            else quaylui(a, n, k, i+1,dem);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int  [] a = new int [100];
        quaylui(a,n,k,1,dem);
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");
        sc.close();
    }
}
