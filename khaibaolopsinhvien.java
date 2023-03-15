package Khaibaolopdoituong;

import java.util.Scanner;

public class khaibaolopsinhvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(a.Chuanhoangay());
        sc.close();
    }
}
class SinhVien{
    private String name,lop,date;
    private float gpa;
    public SinhVien(){
        this.name =this.date = this.lop ="";
        this.gpa=0;
    }
    public SinhVien(String name,String lop ,String date,  float gpa){
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa  = gpa;
    }
    public SinhVien Chuanhoangay(){
        if(this.date.charAt(1) == '/'){
            this.date = "0"+ this.date.substring(0);
        }
        if(this.date.charAt(4) == '/'){
            this.date = this.date.substring(0,3)+ "0" + this.date.substring(3);
        }
        return (new SinhVien(this.name, this.lop, this.date, this.gpa));
    }
    @Override
    public String toString() {
        return "B20DCCN001 " + this.name+" "+this.lop+" "+this.date+" "+String.format("%.2f", gpa);
    }
}