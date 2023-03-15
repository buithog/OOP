
import java.util.Scanner;

public class capsohieunhohonk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k= sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] =sc.nextInt();
        Boolean ok=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(a[i] - a[j]) <k) {
                    System.out.print("("+a[i]+","+a[j]+")");
                    if(i != n-2 ) System.out.print(";");
                    ok=true;
                }
            }
        }
        if(!ok) {
            System.out.println("Không có");
        }
        sc.close();
    }
}
