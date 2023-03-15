package Khaibaolopdoituong;

import java.util.Scanner;

public class baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ID = "NV01";
        String name = sc.nextLine();
        int sal = sc.nextInt();
        int day = sc.nextInt();
        String work = sc.nextLine();
        nhanvien nv = new nhanvien(ID, name, sal, day, work);
        nv.toString();
        sc.close();
// Bui Thi Trang
// 45000
// 23
// PGD
    }
    
}
class nhanvien{
    private String ID;
    private String name;
    private int sal;
    private int day;
    private String work;

    public nhanvien(String ID, String name, int sal, int day, String work) {
        this.ID = ID;
        this.name = name;
        this.sal = sal;
        this.day = day;
        this.work = work;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public int getDay() {
        return day;
    }

    public String getWork() {
        return work;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ID=" + ID + ", name=" + name + ", sal=" + sal + ", day=" + day + ", work=" + work + '}';
    }
    
    
}