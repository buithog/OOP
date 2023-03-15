import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;



public class danhsachdoituongsinhvien1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List <SinhVien> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),Float.valueOf(sc.nextLine()));
            a.setId("B20DCCN" + String.format("%03d", i) );
            a.Chuanhoangay();
            l.add(a);
        }
        Collections.sort(l, new Comparator<SinhVien>() {
            public int compare(SinhVien o1, SinhVien o2){
                if (o1.getGpa() < o2.getGpa() ) return 1 ;
                return -1;
            }
        });
        for(SinhVien x:l){
            System.out.println(x);
        }
    }
}
class SinhVien{
    private String id , name, date,clas;
    private float gpa;
    public SinhVien( String name, String clas, String date, float gpa) {
        this.id ="";
        this.name = name;
        this.date = date;
        this.clas = clas;
        this.gpa = gpa;
    }

    public void Chuanhoangay(){
        String[] s = this.date.split("/");
        String res = "";
        for (int i = 0; i < s.length; ++i){
            if (s[i].length() ==  1) res += "0" + s[i];
            else res += s[i];
            res += "/";
        }
        this.date = res.substring(0, res.length() - 1);
       
       
        StringTokenizer st = new StringTokenizer(this.name);
        String ans ="";
        while(st.hasMoreTokens()){
            String u = st.nextToken();
            char x = u.charAt(0);
            u = u.toLowerCase();
            x = Character.toUpperCase(x);
            u = x+u.substring(1);
            ans += u+" ";
        }
        this.name = ans.substring(0,ans.length()-1) ;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

   

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getClas() {
        return clas;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return this.id+" " +this.name+" "+this.clas+" "+this.date +" "+ String.format("%.2f",gpa);
    }
    
}