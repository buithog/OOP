package Khaibaolopdoituong;


import java.util.Scanner;

public class baitoantuyensinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        a.Getaddpoint();a.Getkq();a.Settongdiem();
        int tongdiem =(int) a.gettongdiem(), diemcong = (int) a.getaddpoint();
        System.out.print(a.getid()+" "+ a.getname()+" ");
        if(a.getaddpoint() ==(float) diemcong) System.out.print(diemcong+ " ");
        else System.out.print(String.format("%.1f ", a.getaddpoint()));
        if(a.gettongdiem() == (float)tongdiem) System.out.print(tongdiem+" ");
        else System.out.print(String.format("%.1f ", a.gettongdiem()));
        System.out.println(a.getkq());
        sc.close();
    }
}
class SinhVien{
     private String id,name,kq;
     private float math,phy,chem,addpoint,tongdiem;
     public SinhVien(String id, String name, float math, float  phy,float chem){
        this.id = id;
        this.name = name;
        this.math =math;
        this.phy = phy;
        this.chem = chem;
     }
     public String getid(){
      return this.id;
     }
     public String getkq(){
      return this.kq;
     }
     public String getname(){
      return this.name;
     }
     public float getaddpoint(){
         return this.addpoint;
     }
     public float gettongdiem(){
      return this.tongdiem;
     }
     public void Settongdiem(){
      this.tongdiem = this.math*2+this.phy + this.chem;
     }
     public void Getaddpoint(){
        if(this.id.substring(0,3).equals("KV1")) this.addpoint = (float) 0.5;
        if(this.id.substring(0,3).equals("KV2")) this.addpoint =  (float) 1;
        if(this.id.substring(0,3).equals("KV3")) this.addpoint = (float) 2.5;
     }
     public void Getkq(){
        if( (float)(this.math*2+this.phy+this.chem + this.addpoint) < (float) 24) this.kq = "TRUOT";
        else this.kq = "TRUNG TUYEN";
     }
     @Override
     public String toString(){
        return this.id +" " + this.name + " " + String.format("%.0f",this.addpoint) + " " + String.format("%.1f",(this.chem+this.math*2+this.phy)) +" " + this.kq;
     }
}