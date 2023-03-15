package Basic;

import java.util.Scanner;

public class demsolanxuathien {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=1;k<=t;k++){
            int n=sc.nextInt();
            int []a = new int[n];
            for(int i=0 ; i < n ; i++) a[i] = sc.nextInt();
            int[] dem = new int[1000005];
            int[] c = new int[n];
            for(int i=0;i<n;i++) c[i]=0;
            for(int i=0;i<n;i++){
                if(c[i] == 0){
                for(int j=i+1;j<n;j++){
                    if(a[j] == a[i]){
                        c[j]=1;
                        dem[i]++;
                    }
                    }
                }
            }
            System.out.println("Test " + k+":");
            for(int i=0;i<n;i++){
                if(c[i] == 0){
                    System.out.println(a[i] + " xuat hien " + (dem[i]+1) + " lan" );
                }
            }
        }
        sc.close();
    }
}
