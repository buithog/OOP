package Khaibaolopdoituong;

import java.util.Scanner;

public class bondiemtrenmatphangtoado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
        sc.close();
    }
}
class Point3D{
    private int x,y,z;
    public Point3D(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D distance(Point3D a ){
        return new Point3D( a.x - this.x , a.y - this.y , a.z - this.z );
    }
    public Point3D cohuong(Point3D b){
        return new Point3D(this.y*b.z - b.y*this.z, - (this.x*b.z - this.z*b.x), this.x*b.y - this.y*b.x);
    }
    public int vohuong(Point3D c){
        return this.x*c.x + this.y*c.y + this.z*c.z;
    }
    public static boolean check(Point3D p1 , Point3D p2, Point3D p3,Point3D p4){
       Point3D ab = p1.distance(p2), ac = p1.distance(p3), ad = p1.distance(p4);
       Point3D cohuongg = ab.cohuong(ac);
       return cohuongg.vohuong(ad) == 0; 
    }
    @Override
    public String toString(){
        return this.x+" "+this.y+" "+this.z;
    }
}