import java.io.File;
import java.io.IOException;
import java.util.*;

public class loaiphong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
class LoaiPhong implements Comparable<LoaiPhong>{
    private  String datain,kh,ten, dongia ,phidv;

    public LoaiPhong(String datain) {
        this.datain = datain;
        String[] data = datain.split("\\s");
        this.kh = data[0];
        this.ten = data[1];
        this.dongia = data[2];
        this.phidv = data[3];
    }

    public String getTen() {
        return ten;
    }



    @Override
    public  String toString(){
        return this.kh +" "+this.ten+" "+this.dongia+" "+this.phidv;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.getTen().compareTo(o.getTen());
    }
}