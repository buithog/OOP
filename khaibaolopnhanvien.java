package Khaibaolopdoituong;

import java.util.Scanner;

public class khaibaolopnhanvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien a = NhanVien.nextNhanVien(sc);
        System.out.println(a.chuanhoabirthday().chuanhoadate().toString());
        sc.close();
    }
}
class NhanVien{
    private String name,sex,birthday,address,id,date;
    public NhanVien(String name, String sex,String birthday, String address, String id, String date){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.id = id;
        this.date = date;
    }
    public NhanVien chuanhoadate(){
        if(this.date.charAt(2) != '/'  ) this.date = "0"+this.date.substring(0);
        if(this.date.charAt(4) == '/'){
            this.date = this.date.substring(0,3)+ "0" + this.date.substring(3);
        }
        return (new NhanVien(name, sex, birthday, address, id, date));
    }
    public NhanVien chuanhoabirthday(){
        if(this.birthday.charAt(2) != '/'  ) this.birthday = "0"+this.birthday.substring(0);
        if(this.birthday.charAt(4) == '/'){
            this.birthday = this.birthday.substring(0,3)+ "0" + this.birthday.substring(3);
        }
        return (new NhanVien(name, sex, birthday, address, id, date));
    }
    public static NhanVien nextNhanVien(Scanner sc){
        return (new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    public String toString(){
        return "00001 " + this.name +" "+ this.sex + " "+ this.birthday + " " + this.address + " " + this.id  + " " + this.date;
    }
}