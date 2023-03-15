package Basic;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class chuanhoahoten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while( t -- > 0){
            String s  = sc.nextLine();
            s = s.toLowerCase();
            Vector<String> v = new Vector<String>();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String a = st.nextToken();
                char u = a.charAt(0);
                u = Character.toUpperCase(u);
                a = "" + u + a.substring(1); 
                v.add(a);
            }
            for(int i=1;i<v.size();i++){
                System.out.print( v.get(i));
                if( i != v.size()-1) System.out.print(" ");
                else System.out.print(",");
            }
            System.out.println(" "+v.get(0).toUpperCase());
        }
        sc.close();
    }
}
