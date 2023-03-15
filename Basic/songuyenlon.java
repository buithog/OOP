package Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class songuyenlon {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String u = sc.nextLine();
        u.isEmpty();
        while(t -- > 0 ){
            BigInteger x =sc.nextBigInteger(), y =sc.nextBigInteger();
            System.out.println(x.add(y));
        }
        sc.close();
    }
}
