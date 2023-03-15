package Basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class chuanhoahoten1 {
    public static void chuanhoa(String s){
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        String x = sc.nextLine();
        x.isEmpty();
        while( t -- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String a = st.nextToken();
                char u = a.charAt(0);
                u = Character.toUpperCase(u);
                a = ""+u+a.substring(1); 
                System.out.print( a +" "); 
            }
            System.out.println();
        }
        sc.close();
    }
    
}
