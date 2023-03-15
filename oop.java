package Khaibaolopdoituong;

public class oop {
    public static void main(String[] args){
        Phanso ps1 = new Phanso(3, 4);
        Phanso ps2 = new Phanso(1 , 6);
        System.out.println(ps1.cong2phanso(ps2));
    }
}
class Phanso{
    int tu;
    int mau;
    public Phanso(int tu,int  mau){
        this.tu = tu;
        this.mau = mau;
    }
    public Phanso cong2phanso(Phanso q){
        int tusomoi = this.tu*q.mau + this.mau*q.tu;
        int mausomoi = this.mau*q.mau;
        return (new Phanso(tusomoi,mausomoi));
    }
    @Override
    public String toString(){
        return tu +"/"+mau;
    }

}
class Tiger{
    Tiger(){

    }
    public void eat(){

    }
}

class Student {
    String name;
    int age;
    int gpa;
    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
    Student(String name, int age, int gpa){
        
    }
}