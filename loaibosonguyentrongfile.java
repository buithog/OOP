import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class loaibosonguyentrongfile {
    public  static  boolean check1 (String x){
        for(int i=0;i<x.length();i++){
            if(Character.isDigit(x.charAt(i))) return false;
        }
        return true;
    }
    public  static  boolean check2 (String x){
        for(int i=0;i<x.length();i++){
            if(Character.isAlphabetic(x.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        File f  = new File("DATA.in");
        try {
            FileInputStream fis = new FileInputStream(f);
            Scanner sc = new Scanner(f);
            List<String> l = new ArrayList<>();
            while(sc.hasNext()){
                String x = sc.next();
                if(x.length()>=10) l.add(x);
                else if(x.length()<10 && !check2(x)){
                    l.add(x);
                }
            }
            Collections.sort(l, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            for(String x: l){
                System.out.print(x+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
