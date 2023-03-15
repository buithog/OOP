import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.*;

public class lietketheothutuxuathientrongfile {
    public static void main(String[] args) {
        File fnb = new File("NHIPHAN.in");
        File fvb = new File("VANBAN.in");
        try {
            FileInputStream fis = new FileInputStream(fnb);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> l1 = (ArrayList<String>) ois.readObject();
            Scanner sc = new Scanner(fvb);
            LinkedHashSet<String> s1 = new LinkedHashSet<>();
            LinkedHashSet<String> s2 = new LinkedHashSet<>();
            for(String x : l1){
                StringTokenizer st = new StringTokenizer(x);
                while(st.hasMoreTokens()){
                    String res = "", a = st.nextToken();
                    for(int i=0;i<a.length();i++){
                        res+= Character.toLowerCase(a.charAt(i));
                    }
                    s1.add(res);
                }
            }
            while(sc.hasNext()){
                String x = sc.next();
                String res = "";
                for(int i=0;i<x.length();i++){
                    res+= Character.toLowerCase(x.charAt(i));
                }
                s2.add(res);
            }
            for(String x : s2){

                if(s1.contains(x)) System.out.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
