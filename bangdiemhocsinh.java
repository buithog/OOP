import java.util.*;

public class bangdiemhocsinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <HocSinh> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String[] res = s.split("\\s+");
            double d1 = Double.parseDouble(res[0]);
            double d2 = Double.parseDouble(res[1]);
            double d3 = Double.parseDouble(res[2]);
            double d4 = Double.parseDouble(res[3]);
            double d5 = Double.parseDouble(res[4]);
            double d6 = Double.parseDouble(res[5]);
            double d7 = Double.parseDouble(res[6]);
            double d8 = Double.parseDouble(res[7]);
            double d9 = Double.parseDouble(res[8]);
            double d10 = Double.parseDouble(res[9]);
            HocSinh x = new HocSinh( ten, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
            list.add(x);
            x.setId(i);x.setTb();x.setXeploai();
        }
        Collections.sort(list, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.getTb() == o2.getTb()) return o1.getId().compareTo(o2.getId());
                if (o1.getTb() > o2.getTb()) return -1;
                return 1;
            }
        });
        for (HocSinh x : list) System.out.println(x);
    }
}
class HocSinh{
    private String ten,xeploai,id;
    private double m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,tb;

        public HocSinh( String ten, double m1, double m2, double m3, double m4, double m5, double m6, double m7, double m8, double m9, double m10) {
        this.ten = ten;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.m6 = m6;
        this.m7 = m7;
        this.m8 = m8;
        this.m9 = m9;
        this.m10 = m10;
    }

    public Double getTb() {
        return tb;
    }

    public String getId() {
        return id;
    }

    public  void setId(int cnt){
        this.id = "HS"+ String.format("%02d",cnt);
    }
    public  void setTb(){
        this.tb = Math.round((((this.m1*2+this.m2*2+this.m3+this.m4+this.m5+this.m6+this.m7+this.m8+this.m9+this.m10)/12)*10))/10.0;
    }
    public  void setXeploai(){
        if(this.tb <(double) 5) this.xeploai ="YEU";
        if(this.tb >= (double) 5 && this.tb < (double) 7) this.xeploai ="TB";
        if(this.tb >= (double) 7 && this.tb < (double) 8) this.xeploai ="KHA";
        if(this.tb >= (double) 8 && this.tb < (double) 9) this.xeploai ="GIOI";
        if(this.tb >= (double) 9) this.xeploai ="XUAT SAC";
    }
    @Override
    public  String toString(){
        return this.id +" "+this.ten+" "+String.format("%.1f",this.tb)+" "+this.xeploai;
    }
}