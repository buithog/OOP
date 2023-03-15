
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class danhsachmathang {
       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = Integer.valueOf(sc.nextLine());
            List<MatHang> l = new ArrayList<>();
            for(int i=1;i<= t;i++){
                MatHang a = MatHang.nextMatHang(sc);
                a.setId(i) ;
                a.setloinhuan();
                l.add(a);
            }
            Collections.sort(l, new Comparator<MatHang>(){
                @Override
                public int compare(MatHang o1, MatHang o2) {
                    if(o1.getLoinhuan() !=   o2.getLoinhuan()) return (int) (o2.getLoinhuan() - o1.getLoinhuan());
                    else return o1.getName().compareTo(o2.getName());
                }
           
       });
            for(MatHang x : l){
                System.out.println(x);
            }
    }
}
class MatHang{
    private String id,name,dv;
    private Long  giamua,giaban,loinhuan;
    public MatHang( String name,String dv,Long giamua, Long giaban){
        this.name = name;
        this.dv= dv;
        this.giamua = giamua;
        this.giaban= giaban;
    }
    public void setId(int cnt){
        this.id ="MH" +  String.format("%03d", cnt);
    }
    public Long getGiamua(){
        return this.giamua;
    }

    public Long getLoinhuan() {
        return loinhuan;
    }

    public String getName() {
        return name;
    }
    public Long getGiaban(){
        return this.giaban;
    }

    public String getId() {
        return id;
    }
    public void setloinhuan(){
        this.loinhuan = this.giaban - this.giamua;
    }
    public static  MatHang nextMatHang(Scanner sc){
        return new MatHang(sc.nextLine(), sc.nextLine(),Long.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine()));
    }
    @Override
    public String toString(){
        return this.id+" " +this.name+" "+this.dv+" "+this.giamua+" " +this.giaban+ " "+this.loinhuan;
    }
}

