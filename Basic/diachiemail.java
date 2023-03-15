package Basic;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class diachiemail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
                sc.nextLine();
            while(t -- > 0){
                String s = sc.nextLine();
                StringTokenizer st = new StringTokenizer(s);
                Vector <String> v   = new Vector<>();
                while(st.hasMoreTokens()){
                    v.add(st.nextToken().toLowerCase());
                }
                System.out.print(v[ v.size() - 1] );
                
            }
        }
    }
}
