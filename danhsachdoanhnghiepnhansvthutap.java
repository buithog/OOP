import java.util.*;

public class danhsachdoanhnghiepnhansvthutap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<DoanhNghiep> l = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t -- > 0){
            DoanhNghiep a = new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.valueOf(sc.nextLine()));
            l.add(a);
        }
        Collections.sort(l, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getSl() != o2.getSl()) return o2.getSl() - o1.getSl();
                else return o1.getName().compareTo(o2.getName());
            }
        });

        int q = Integer.valueOf(sc.nextLine());
        while (q--> 0 ){
            int x = sc.nextInt(),y = sc.nextInt();
            sc.nextLine();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+x+" DEN " + y+ " SINH VIEN:");
            for(DoanhNghiep u: l){
                if(u.getSl()<=y &&u.getSl()>=x) System.out.println(u);
            }
        }
    }
}
class  DoanhNghiep{
    private String name,fullname;
    private Integer sl;

    public DoanhNghiep(String name, String fullname, Integer sl) {
        this.name = name;
        this.fullname = fullname;
        this.sl = sl;
    }

    public String getName() {
        return name;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getSl() {
        return sl;
    }
    @Override
    public String toString(){
        return this.name+" "+this.fullname+" "+this.sl;
    }
}