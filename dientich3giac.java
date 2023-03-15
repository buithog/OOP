package Khaibaolopdoituong;

import java.util.Scanner;

public class dientich3giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            point a = point.nextPoint(sc), b = point.nextPoint(sc), c = point.nextPoint(sc);
            double ac = a.distance(c), ab = a.distance(b), bc = b.distance(c);
            if (ab < ac + bc && bc < ab + ac && ac < bc + ab){
                Double x = (ab+ac+bc)/2;
                System.out.format("%.2f\n",(Double) (Math.sqrt( x*(x-ab)*(x-ac)*(x-bc) )));    
            }
            else
            System.out.println("INVALID");
        }
    }
}
class point{
    private double x;
    private double y;
    public point(double x, double y){
        this.x = x ;
        this.y = y; 
    }
    public point(){
        this.x = 0 ;
        this.y = 0; 
    }
    public point(point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x =x;
    }

    public  double distance( point secondpoint){
        return Math.sqrt((this.x - secondpoint.x)*(this.x - secondpoint.x) + (this.y - secondpoint.y) * (this.y - secondpoint.y) );
    }
    public  double distance(point p , point q){
        return Math.sqrt((q.x - p.x)*(q.x - p.x) + (q.y - p.y) * (q.y - p.y) );
    }
    public static point nextPoint(Scanner sc){
        return new point(sc.nextDouble(),sc.nextDouble());
    }

    @Override
    public String toString(){
        return "(" + x +" " + y + ")";
    }
}