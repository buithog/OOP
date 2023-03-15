package Basic;

import java.util.Scanner;

public class binhphuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            Long n = sc.nextLong();
            System.out.println(n*n);
        }
    }
}
