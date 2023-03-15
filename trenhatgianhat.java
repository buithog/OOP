import java.util.*;

public class trenhatgianhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Human> l = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t--> 0){
            String a = sc.nextLine();
            String[] res = a.split(" ");
            Human u = new Human(res[0],res[1]);
            u.SetTuoi();
            l.add(u);
        }
        Collections.sort(l, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o2.getTuoi().compareTo(o1.getTuoi());
            }
        });
        System.out.println(l.get(0));
        System.out.println(l.get(l.size()-1));
    }
}
class Human{
    private String name,date,tuoi;

    public Human(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void SetTuoi(){
        this.tuoi = this.date.substring(6)+this.date.substring(3,6)+this.date.substring(0,2);
    }
    @Override
    public String toString(){
        return this.name;
    }
}