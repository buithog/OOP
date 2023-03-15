package Basic;

import java.util.Scanner;

public class sodep3 {
    public static boolean check(String s){
        int l=0, r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r) ) return false;
            l++;r--;
        }
        for(int i=0;i<s.length();i++){
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(num < 2 ) return false;
            for(int j=2;j<=Math.sqrt(num);j++){
                if( num % i == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new  Scanner(System.in);
        int t = sc.nextInt();
        String x = sc.nextLine();
        x.isEmpty();
        while(t -- > 0){
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");   
        }
        sc.close();
    }
}
