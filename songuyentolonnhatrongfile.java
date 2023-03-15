import java.io.*;
import java.util.*;

public class songuyentolonnhatrongfile {
    public static void main(String[] args) {
        File f = new File("DATA.in");
        int [] p = new int[1000006];
        for(int i=2;i<1000;i++){
            if(p[i] == 0) {
                for (int j = i * i; j < 1000006; j += i) {
                    p[j] = 1;
                }
            }
        }
        try {
            FileInputStream fis = new FileInputStream(f);
            ArrayList<Integer> l = new ArrayList<>();
            ObjectInputStream obs = new ObjectInputStream(fis);
            l =(ArrayList<Integer>) obs.readObject();
            int [] a = new int[1000006];
            for(int x: l) if(p[x] == 0) a[x]++;
            int cnt =0;
            for(int i=1000005;i>=2;i--){
                if(cnt<10 && a[i] >0) {
                    System.out.println(i + " " + a[i]);
                    cnt++;
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
