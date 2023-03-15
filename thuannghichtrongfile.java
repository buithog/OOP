import java.io.*;
import java.util.*;

public class thuannghichtrongfile {
    public static Boolean tn(int n){
        int tmp=0,n2= n;
        while(n>0){
            tmp = tmp*10+n%10;
            n/=10;
        }
        return tmp == n2;
    }
    public static Boolean sum(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        if(cnt>1&&cnt%2 == 1) return true;
        return false;
    }
    public static   Boolean check(int n){
        while(n>0){
            int tmp = n%10;
            if(tmp%2 ==0) return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        File f1 = new File("DATA1.in");
        File f2 = new File("DATA2.in");
        int[] p = new int[1000006];
        for (int i = 2; i < 1000; i++) {
            if (p[i] == 0) {
                for (int j = i * i; j < 1000006; j += i) {
                    p[j] = 1;
                }
            }
        }

        try {
            FileInputStream fis1 = new FileInputStream(f1);
            FileInputStream fis2 = new FileInputStream(f2);
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
            ObjectInputStream obs1 = new ObjectInputStream(fis1);
            ObjectInputStream obs2 = new ObjectInputStream(fis2);
            l1 =(ArrayList<Integer>) obs1.readObject();
            l2 =(ArrayList<Integer>) obs2.readObject();
            int [] a1 = new int [1000005];
            int []  a2 = new int[1000005];
            for(int x : l1){
                if(check(x) && sum(x) && tn(x)){
                    a1[x]++;
                }
            }
            for(int x : l2){
                if(check(x) && sum(x)&&tn(x)){
                    a2[x]++;
                }
            }
            int cnt =0;
            for(int i =10;i<10000005;i++){
                if(a1[i] > 0 && a2[i]>0  ){
                    System.out.println(i+" "+( a1[i] + a2[i] ) );
                    cnt++;
                }
                if(cnt ==10) break;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
