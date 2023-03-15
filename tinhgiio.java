
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class tinhgiio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List <NguoiChoi> l = new ArrayList<>();
        while(t -- > 0){
            NguoiChoi a = new NguoiChoi(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.setPhut();a.setTime();
            l.add(a);
        }
        Collections.sort(l,new Comparator<NguoiChoi>() {
            public int compare(NguoiChoi a, NguoiChoi b){
                return (int) (b.getPhut() - a.getPhut());
            }
        });
        for(NguoiChoi x:l) System.out.println(x);
        sc.close();
    }
}
class NguoiChoi{
    private String ten,id,timein,timeout,time;
    private Long phut;
    public NguoiChoi(String id, String ten, String timein,String timeout){
        this.id =id;
        this.ten = ten;
        this.timein= timein;
        this.timeout = timeout;
    }
    public Long getPhut() {
        return this.phut;
    }
    public void setPhut(){
        this.phut = (Long.valueOf(this.timeout.substring(0,2))*60 + Long.valueOf(this.timeout.substring(3)) ) - (Long.valueOf(this.timein.substring(0,2))*60 + Long.valueOf(this.timein.substring(3)) ) ;
    }
    public void setTime(){
        this.time = String.valueOf(this.phut/60) +" gio "+String.valueOf(this.phut%60)+" phut";
    }
    @Override
    public String toString(){
        return this.id+" "+this.ten+ " "+this.time;
    }
}