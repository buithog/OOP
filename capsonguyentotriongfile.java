import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class capsonguyentotriongfile {
    public static void main(String[] args) {
        File f1 = new File("DATA1.in");
        File f2 = new File("DATA2.in");
        int [] p = new int[1000006];
        for(int i=2;i<1000;i++){
            if(p[i] == 0) {
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
            int []a = new int[1000001];
            for(int x: l2) {
                if(p[x] == 0) a[x]++;
            }


            TreeSet<Integer> ts = new TreeSet<>();
            for(int x :l1) if(p[x] == 0) ts.add(x);

            for(int x :ts){
                if( a[1000000 -x] >0 && x<1000000-x){
                    System.out.println(x+" "+(1000000-x));
                }
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
