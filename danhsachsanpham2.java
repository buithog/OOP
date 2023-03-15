import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class danhsachsanpham2 {
    public static void main(String[] args) {
        File f = new File("SANPHAM.in");
        List<SanPham> l = new ArrayList<>();
        try {
            Scanner sc = new Scanner(f);
            int t = Integer.parseInt(sc.nextLine());

            while(sc.hasNextLine()){
                SanPham a = new SanPham();
                a.setId(sc.nextLine());
                a.setName(sc.nextLine());
                a.setCost(Integer.valueOf(sc.nextLine()));
                a.setMonth(Integer.valueOf(sc.nextLine()));
                l.add(a);
                if(t <= 0) break;
                t--;
            }
            Collections.sort(l);
            for(SanPham x : l){
                System.out.println(x);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
class SanPham implements Comparable<SanPham>{
    private String id,name;
    private int cost,month;

    public SanPham() {
        id = "";
        name = "";
        cost =0;
        month = 0 ;
    }

    public String getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    @Override
    public  String toString(){
        return this.id + " " +this.name +" " +this.cost+" "+this.month;
    }
    @Override
    public int compareTo(SanPham o1){
        if(this.cost != o1.getCost()) return o1.cost - this.cost;
        else return this.id.compareTo(o1.id);
    }
}