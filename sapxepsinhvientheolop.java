import java.util.*;

public class sapxepsinhvientheolop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List <SinhVien> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SinhVien a = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.setStt(i);
            l.add(a);
        }
        Collections.sort(l, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        int q = Integer.valueOf(sc.nextLine());
        while(q -- > 0) {
            String u = sc.nextLine();
            for(SinhVien x : l){
                if(x.getCty().equals(u)) System.out.println(x);
            }
        }
        sc.close();
    }
}
class SinhVien{
    private  String ten,lop,id,email,cty;
    private  int stt;
    public SinhVien( String id,String ten, String lop, String email,String cty) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.cty = cty;
    }
    public void setStt(int cnt){
        this.stt = cnt;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getCty() {
        return cty;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.stt+" "+this.id+" "+this.ten+" "+this.lop+" "+this.email+" "+this.cty;
    }
}