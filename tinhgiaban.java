import java.util.Scanner;

public class tinhgiaban {
    Scanner sc = new Scanner(System.in);

}
class MatHang{
    private int sl;
    private String id,name,dv;
    private Double  giamua,giaban,thanhtien;
    public MatHang( String name,String dv,Double giamua,int sl){
        this.name = name;
        this.dv= dv;
        this.giamua = giamua;
        this.sl = sl;
    }
    public void setId(int cnt){
        this.id =String.format("%02d",cnt);
    }
    public Double getGiamua(){
        return this.giamua;
    }

    public Double getThanhtien() {
        return thanhtien;
    }
    public int getSl(){
        return this.sl;
    }

    public String getId() {
        return id;
    }
    public void setThanhtien(){
        this.thanhtien = Double.valueOf(Math.round(this.giamua*0.05));
    }
    @Override
    public String toString(){
        return this.id+" " +this.name+" "+this.dv+ " "+String.format("%.2f", this.thanhtien);
    }
}