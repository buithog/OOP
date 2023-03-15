package Basic;
import java.util.*; 

public class hinhchunhat {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        if(n <= 0 || t <= 0) System.out.print(0);
        else {
        System.out.print((n+t)*2+" "+n*t);
        }
        sc.close();
    }
}
