import java.util.*;

public class bangdiemthanhphan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SV> l = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=t;i++){
            SV a = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        l.add(a);
        }
        Collections.sort(l, new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i=1;i<=t;i++){
            System.out.println(i+" "+l.get(i-1));
        }
    }
}
class SV{
    private  String id,name,lass;
    private Double m1,m2,m3;

    public SV(String id, String name, String lass, Double m1, Double m2, Double m3) {
        this.id = id;
        this.name = name;
        this.lass = lass;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLass() {
        return lass;
    }

    public Double getM1() {
        return m1;
    }

    public Double getM2() {
        return m2;
    }

    public Double getM3() {
        return m3;
    }

    @Override
    public  String toString(){
        return  this.id+" "+this.name+" "+this.lass+" "+this.m1+" "+this.m2+" "+this.m3;
    }
}