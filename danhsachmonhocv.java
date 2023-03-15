import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class danhsachmonhocv {
    public static void main(String[] args) {
        File f = new File("MONHOC.in");
        List<Monhoc> l = new ArrayList<>();
        try {
            Scanner sc = new Scanner(f);
            int t = Integer.parseInt(sc.nextLine());
            while(sc.hasNextLine()){
            Monhoc a = new Monhoc();
            a.setMa(sc.nextLine());
            a.setTen(sc.nextLine());
            a.setTc(sc.nextLine());
            l.add(a);
            if(t <= 0) break;
            t--;
            }
            Collections.sort(l, new Comparator<Monhoc>() {
                @Override
                public int compare(Monhoc o1, Monhoc o2) {
                    return o1.getTen().compareTo(o2.getTen());
                }
            });
            for(Monhoc x:l){
                System.out.println(x.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Monhoc{
    private String ma,ten,tc;

    public Monhoc() {
        this.ma ="";
        this.tc="";
        this.ten="";
    }

    public String getTen() {
        return ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
    public  String toString(){
        return this.ma+" "+this.ten+" "+this.tc;
    }
}
