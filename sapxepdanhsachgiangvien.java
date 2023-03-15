
import java.util.*;

public class sapxepdanhsachgiangvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List<GiangVien> l = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            GiangVien a = new GiangVien(sc.nextLine(), sc.nextLine());
            a.setViet();
            a.setId(i);
            l.add(a);
        }
//        Collections.sort(l, new Comparator<GiangVien>() {
//            @Override
//            public int compare(GiangVien o1, GiangVien o2) {
//                if(o1.getTen().equals(o2.getTen()) == true) return o1.getId().compareTo(o2.getId());
//                else return o1.getTen().compareTo(o2.getTen());
//            }
//        });
        int q = Integer.valueOf(sc.nextLine());
        while (q-- > 0) {
            String u = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + u + ":");
            u =u.toLowerCase();
            for (GiangVien x : l) {
                if (x.getFullten().contains(u)) System.out.println(x);
            }
        }
    }
}
class GiangVien{
    private String ten,id,nganh,viet;

    public GiangVien(String ten, String nganh) {
        this.ten = ten;
        this.nganh = nganh;
    }
    public  void setId(int cnt){
        this.id ="GV"+ String.format("%02d",cnt);
    }
    public String getFullten(){
        return this.ten.toLowerCase();
    }
    public void setViet() {
        String[] res = this.nganh.split(" ");
        String ans ="";
        for(int i=0;i<res.length;i++){
            ans += res[i].charAt(0);
        }
        this.viet = ans.toUpperCase();
    }

    public String getTen() {
        String [] res = this.ten.split(" ");
        return res[res.length-1];
    }

    public String getId() {
        return id;
    }

    public String getNganh() {
        return nganh;
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }
    @Override
    public  String toString(){
        return this.id+" "+this.ten+" "+this.viet;
    }
}