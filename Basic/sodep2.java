package Basic;

import java.util.Scanner;

public class sodep2 {
    public static boolean check(String s){
        int l=0, r = s.length()-1;
        if(s.charAt(l) != '8'  && s.charAt(r) != '8') return false;
        while(l<r){
            if(s.charAt(l) != s.charAt(r) ) return false;
            l++;r--;
        }
        int sum =0;
        for(int i=0;i<s.length();i++){
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum+=num;
        }
        if(sum%10 != 0) return false;
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
