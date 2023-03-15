import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class danhsachmathangtrongfile {
    public static void main(String[] args) {
        File f = new File("MATHANG.in");
        List<Mat_Hang> l = new ArrayList<>();
        try {
            Scanner sc = new Scanner(f);
            int t = Integer.parseInt(sc.nextLine());
            int cnt =1;
            while(sc.hasNextLine()){
                Mat_Hang a = new Mat_Hang();
                a.setId(cnt);
                a.setName(sc.nextLine());
                a.setGr(sc.nextLine());
                a.setGiamua(Float.valueOf(sc.nextLine()));
                a.setGiaban(Float.valueOf(sc.nextLine()));
                a.setLoinhuan();
                l.add(a);

                if(cnt == t) break;
                cnt++;
            }
            Collections.sort(l, new Comparator<Mat_Hang>() {
                @Override
                public int compare(Mat_Hang o1, Mat_Hang o2) {
                    return (int) (o2.getLoinhuan() - o1.getLoinhuan());
                }
            });
            for( Mat_Hang x : l ){
                System.out.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Mat_Hang{
    private String id,name,gr;
    private Float giamua,giaban,loinhuan;

    public Mat_Hang() {
        id = "";
        name = "";
        gr = "";
        giamua = Float.valueOf(0);
        giaban = Float.valueOf(0);
        loinhuan = giaban -giamua;
    }

    public Float getLoinhuan() {
        return loinhuan;
    }

    public void setId(int cnt) {
        this.id = "MH" + String.format("%02d",cnt);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public void setGiamua(Float giamua) {
        this.giamua = giamua;
    }

    public void setGiaban(Float giaban) {
        this.giaban = giaban;
    }
    public  void setLoinhuan(){
        this.loinhuan = this.giaban -this.giamua;
    }
    public String toString(){
        return this.id + " "+ this.name+" "+this.gr +" " +String.format("%.2f",this.loinhuan);
    }
}