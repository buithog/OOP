import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class danhsacshdoituongnhanvien {
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        List<NhanVien> l = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=t;i++){
            NhanVien a = new NhanVien(sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.setid(i);a.setNsdao();
            l.add(a);
        }
        Collections.sort(l,new Comparator<NhanVien>() {
            public int compare(NhanVien o1,NhanVien o2){
                return o1.getNsdao().compareTo(o2.getNsdao());
            }
        });
        for(NhanVien x : l){
            System.out.println(x);
        }
        sc.close();
    }
}
class NhanVien{
    private String id,name,sex,mst,date,birth,ad, nsdao;
    public NhanVien( String name, String sex, String birth,String ad, String mst ,String date){
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.ad = ad;
        this.mst = mst;
        this.date = date;
    }
    public String getNsdao(){
        return this.nsdao;
    }
    public void setNsdao(){
        Vector <String> v = new Vector<>();
        int index=0;
        for(int i=0;i<this.birth.length();i++){
            String tu = "";
            if(this.birth.charAt(i) == '/' ) {
                tu = this.birth.substring(index,i);
                index =i+1;
                v.add(tu);
            }
        }
        v.add(this.birth.substring(index));
        String res ="";
        for(int i = v.size()-1;i>=0;i--){
            res += v.get(i);
        }
        this.nsdao = res;
    }
    public void setid(int cnt){
        this.id = String.format("%05d",cnt) ;
      }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.sex+" "+this.birth+" "+this.ad+" "+this.mst+" "+this.date;
    }
}