

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thukhoakythi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        float max = (float) 0 ;
        List<ThiSinh> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            ThiSinh a = new ThiSinh(sc.nextLine(),sc.nextLine(),Float.valueOf(sc.nextLine()),Float.valueOf(sc.nextLine()),Float.valueOf(sc.nextLine()));
            a.setID(i);a.setTong();
            float x = a.getTong();
            if(x > max) max = x;
            l.add(a);
        }
        
        for(int i=0;i<l.size();i++){
           if(l.get(i).getTong() == max) System.out.println(l.get(i));
        }
        sc.close();
    }
}
class ThiSinh{
    private int id;
    private String name,ns;
    private Float m1,m2,m3,tong;
    public ThiSinh(String name,String ns,Float m1,Float m2,Float m3){
        this.name = name;
        this.ns = ns;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void setTong(){
        this.tong = this.m1+this.m2+this.m3;
    }
    public Float getTong(){
        return this.tong;
    }
    public int getID(){
        return this.id;
    }
    public void setID(int cnt){
        this.id =cnt;
    }
    public Float getm1(){
        return this.m1;
    }
    public Float getm2(){
        return this.m2;
    }
    public Float getm3(){
        return this.m3;
    }
    @Override
    public String toString(){
        return this.id + " "+this.name+" "+this.ns+" "+String.format("%.1f",this.tong);
    }
}