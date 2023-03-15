import java.util.Scanner;

public class loptriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
class Triangle{
    private Double a,b,c;
    public Triangle(Point x, Point y, Point z){
        this.a = x.distance(y);
        this.b = x.distance(z);
        this.c = y.distance(z);
    }
    public Boolean valid(){
        if (this.a < this.b + this.c && this.c < this.a+this.b  && this.b < this.a + this.c) return true;
        return false;
    }
    public String getPerimeter(){
        return String.format("%.3f", a+b+c);
    }
}
class Point{
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x ;
        this.y = y; 
    }
    public Point(){
        this.x = 0 ;
        this.y = 0; 
    }
    public Point(point p){
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

    public  double distance( Point secondpoint){
        return Math.sqrt((this.x - secondpoint.x)*(this.x - secondpoint.x) + (this.y - secondpoint.y) * (this.y - secondpoint.y) );
    }
    public  double distance(Point p , Point q){
        return Math.sqrt((q.x - p.x)*(q.x - p.x) + (q.y - p.y) * (q.y - p.y) );
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }

    @Override
    public String toString(){
        return "(" + x +" " + y + ")";
    }
}