import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class danhsachluutru {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\fpt\\OneDrive\\Máy tính\\New Text Document.txt");
        List<Khach> l = new ArrayList<>();
        try {
            Scanner sc = new Scanner(f);
            int t = Integer.parseInt(sc.nextLine());
            int cnt =1;
            while(sc.hasNextLine()){
                Khach a = new Khach();
                a.setTen(sc.nextLine());
                a.setMaphong(sc.nextLine());
                a.setNgayden(sc.nextLine());
                a.setNgaydi(sc.nextLine());
                a.setMa(cnt);
                if(cnt>t) break;
                cnt++;
                a.setSongay();
                l.add(a);
            }
            Collections.sort(l, new Comparator<Khach>() {
                @Override
                public int compare(Khach o1, Khach o2) {
                    return (int) (o2.getSongay() - o1.getSongay());
                }
            });
            for (Khach x : l){
                System.out.println(x.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Khach{
    private String ma,ten,maphong, ngayden,ngaydi;
    private long songay;

    public Khach() {
        ma ="";
        ten = "";
        maphong="";
        ngayden="";
        ngaydi = "";
        songay = 0;
    }

    public long getSongay() {
        return songay;
    }

    public void setMa(int x) {
        this.ma = "KH"+ String.format("%02d",x);
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public void setNgayden(String ngayden) {
        this.ngayden = ngayden;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    public void setSongay() {
        DateFormat DF = new SimpleDateFormat("dd/MM/yyyy");

        long ngay = 0;
        try {
            Date den = DF.parse(this.ngayden);
            Date di = DF.parse(this.ngaydi);
            Long x = di.getTime() - den.getTime();
            ngay = (x/(24*60*60*1000));
            this.songay = ngay;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
    @Override
    public  String toString(){
        return this.ma+" "+this.ten+" "+this.maphong+" "+this.songay;
    }
}