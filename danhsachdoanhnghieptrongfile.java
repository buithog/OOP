import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class danhsachdoanhnghieptrongfile {
    public static void main(String[] args) {
        File f = new File("DN.in");
        List<DN> l = new ArrayList<>();
        try {
            Scanner sc =  new Scanner(f);
            int t = Integer.parseInt(sc.nextLine());
            while(sc.hasNextLine()){
                DN a = new DN();
                a.setMa(sc.nextLine());
                a.setTen(sc.nextLine());
                a.setSl(sc.nextLine());
                l.add(a);
                if(t <= 0) break;
                t--;
            }
            Collections.sort(l, new Comparator<DN>() {
                @Override
                public int compare(DN o1, DN o2) {
                    return o1.getMa().compareTo(o2.getMa());
                }
            });
            for(DN x: l){
                System.out.println(x.toString());
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
class DN{
    private String ma, ten, sl;

    public DN() {
        this.ma = "";
        this.ten = "";
        this.sl = "";
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }
    public  String toString(){
        return this.ma+" "+this.ten+" "+this.sl;
    }
}