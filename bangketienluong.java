import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bangketienluong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List<NhanVien> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            NhanVien a = new NhanVien(sc.nextLine(),Long.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine()), sc.nextLine());
            a.setId(i);a.setThuong();a.setPhucap();a.setThuclinh();
            l.add(a);
        }
       // long sumsalary=0;
        for(NhanVien x: l){
            System.out.println(x);
           // sumsalary += x.getThuclinh();
        }
        //System.out.println("Tong chi phi tien luong: "+sumsalary);
    }
}
class NhanVien{
    private  String name,cv,id;
    private Long luongngay,songay,phucap,luongthang,thuclinh,thuong;

    public NhanVien(String name, Long luongngay, Long songay, String cv) {
        this.name = name;
        this.luongngay = luongngay;
        this.songay = songay;
        this.cv = cv;
        this.phucap= Long.valueOf(0);
        this.luongthang =(long) this.luongngay*this.songay;
    }

    public void setPhucap() {
        if(this.cv.equals("GD")) this.phucap = Long.valueOf(250000);
        if(this.cv.equals("PGD")) this.phucap = Long.valueOf(200000);
        if(this.cv.equals("TP")) this.phucap = Long.valueOf(180000);
        if(this.cv.equals("NV")) this.phucap = Long.valueOf(150000);
    }

    public void setId(int cnt) {
        this.id ="NV" + String.format("%02d",cnt);

    }

    public void setThuong() {
        if(this.songay >= 25 ) this.thuong = (long) (this.luongthang*0.2);
         if(this.songay >= 22 && this.songay < 25 ) this.thuong = (long)(this.luongthang*0.1);
         if(this.songay <22) this.thuong =(long) 0;
    }

    public void setThuclinh() {
        this.thuclinh = this.luongthang+this.phucap+this.thuong;
    }

    public Long getThuclinh() {
        return thuclinh;
    }
    @Override
    public String toString(){
        return this.id +" "+this.name+" "+this.luongthang+" "+this.thuong+" "+this.phucap+" "+this.thuclinh;
    }
}