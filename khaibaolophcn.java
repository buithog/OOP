package Khaibaolopdoituong;

import java.util.Scanner;

public class khaibaolophcn {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double w  = sc.nextDouble() , h = sc.nextDouble();
        String color = sc.next();
        if( w < 1 || h < 1){
            System.out.println("INVALID");
        }
        else {
            color = color.toLowerCase();
            char x = color.charAt(0);
            x = Character.toUpperCase(x);
            color =""+x+color.substring(1);
            hcn h1 = new hcn(w, h, color);
            System.out.format("%.0f ", h1.findPerimeter());
                System.out.format("%.0f ", h1.find());
            System.out.println(h1.getColor());
        }
        sc.close();
    }
    
}
class hcn{
    private double w,h;
    private String color;
    public hcn(){
        this.w = 1;
        this.h = 1;
        this.color = "" ;
    }
    public hcn(double w, double h, String color){
        this.w = w;
        this.h = h;
        this.color = color;
    }
    public double getW(){
        return this.w;
    }
    public double getH(){
        return this.h;
    }
    public String getColor(){
        return this.color;
    }
    public void setW(double w){
        this.w = w;
    }
    public void setH(double h){
        this.h = h;
    }
    public void setColor(String color) {
        this.color = color;   
    }
    public double find(){
        return (this.w *this.h);
    }
    public double findPerimeter(){
        return (this.w + this.h)*2 ;
    }
}