import java.util.Scanner;

public class tinhtoanphanso {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            Phansoo a = new Phansoo(sc.nextLong(),sc.nextLong()),b = new Phansoo(sc.nextLong(),sc.nextLong());
            System.out.print(a.tongPhansoo(b).binhphuongpPhansoo().rutgonPhanso()+" " );
            Phansoo c = a.tongPhansoo(b).binhphuongpPhansoo().rutgonPhanso();
            System.out.println(a.tich3phanso(b, c).rutgonPhanso());
        }
    }
}
class Phansoo{
    private long tu,mau;
    public Phansoo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public Phansoo rutgonPhanso(){
        long x = gcd(tu,mau);
        this.tu /=x;
        this.mau /= x;
        return (new Phansoo(this.tu, this.mau));
    }
    public Phansoo tongPhansoo(Phansoo p){
        long tumoi = (this.tu*p.mau + p.tu*this.mau);
        long maumoi = (this.mau * p.mau);
        return (new Phansoo(tumoi, maumoi));
    }
    public Phansoo tich3phanso(Phansoo a, Phansoo b){
        return (new Phansoo(this.tu*a.tu*b.tu,this.mau*a.mau*b.mau));
    }
    public Phansoo binhphuongpPhansoo(){
        return (new Phansoo(this.tu*this.tu, this.mau*this.mau));
    }
    public String toString(){
        return tu+"/"+mau; 
    }
    public long gcd( long a, long b) {
        if( b == 0) return a;
        else return gcd(b, a%b);
    }
    
}