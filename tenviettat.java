import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class tenviettat {
    public static void main(String[] args) {
        File  f = new File("DANHSACH.in");
        try {
            Scanner sc = new Scanner(f);
            ArrayList<String> l = new ArrayList<>();
            ArrayList<String> lvt = new ArrayList<>();
            int t = Integer.valueOf(sc.next());
            int cnt =1;
            while(sc.hasNextLine()){
                cnt++;
                if(cnt < t+1){
                    String x = sc.nextLine();
                    l.add(x);
                    StringTokenizer st = new StringTokenizer(x );
                    String res ="";
                    while(st.hasMoreTokens()){
                        String u = st.nextToken();
                        res += u.charAt(0);

                    }
                    lvt.add(res);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
