package Khaibaolopdoituong;

import java.util.Scanner;

public class tinhluonggiaovien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GiaoVien1 a =  new GiaoVien1(sc.nextLine(),sc.nextLine(), sc.nextLine());
        a.heso();a.phucap();a.Luong();
        System.out.println(a.toString());
        sc.close();
    }
    
}
class GiaoVien1{
    private String id,name,salarybase,salaryreal;
    private int hs,pc;
    public GiaoVien1(String id,String name , String salarybase){
        this.id = id;
        this.name = name;
        this.salarybase = salarybase;
        // this.salaryreal = "";
        // this.hs = 0;
        // this.pc = "";
    }
    public void phucap(){
        String u = this.id.substring(0,2);
        if( u.equals("HT")) this.pc = 2000000;
        if( u.equals("HP")) this.pc = 900000;
        if(u.equals("GV")) this.pc = 500000;
    }
    public void heso(){
        int s = 0;
        for(int i=0;i<this.id.length();i++){
            if(Character.isDigit(this.id.charAt(i))){
                String x = String.valueOf(id.charAt(i));
                s = s*10 + Integer.parseInt(x);
            }
        }
        this.hs = s;
    }
    public void Luong(){
        this.salaryreal = String.valueOf(this.hs * Integer.parseInt(this.salarybase) + this.pc);
    }
    @Override
    public String toString(){
        return this.id +" " + this.name + " " + this.hs + " "+ this.pc + " " + this.salaryreal;
    }
}