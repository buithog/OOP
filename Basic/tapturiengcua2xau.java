package Basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class tapturiengcua2xau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String x = sc.nextLine();
        x.isEmpty();
        while( t -- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Set<String> sh1 = new HashSet<>();
            Set<String> sh2 = new HashSet<>();
            StringTokenizer st1 = new StringTokenizer(s1);
            StringTokenizer st2 = new StringTokenizer(s2);
            while( st1.hasMoreTokens()){
                sh1.add(st1.nextToken());
            }
            while(st2.hasMoreTokens()){
                sh2.add(st2.nextToken());
            }
            for(String u : sh1){
                if(!sh2.contains(u)) System.out.print(u+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
