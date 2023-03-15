package Khaibaolopdoituong;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class danhsachmonthi {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc  = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List <Subject> a = new ArrayList<Subject>();
        for(int i=1;i<=n;i++){
            Subject x = new Subject(sc.nextLine(), sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        //      comparator````
        // Collections.sort(a,new Comparator<Subject>() {
        //     @Override
        //     public int compare(Subject a1, Subject a2){
        //         return a1.getidsub().compareTo(a2.getidsub());
        //     }
        // } );
        //     bieu thuc lamda
        // Collections.sort ( a,(Subject a1, Subject a2 ) -> a1.getidsub().compareTo(a2.getidsub())  );
        Collections.sort(a);
        for(Subject u : a){
            System.out.println(u);
        }
    }
}
class Subject implements Comparable<Subject>{ 
    private String idsub,namesub,fomat;
    public Subject(String idsub,String namesub,String fomat){
        this.idsub =idsub;
        this.namesub = namesub;
        this.fomat = fomat;
    }
    public String getidsub(){
        return this.idsub;
    }
    @Override
    public String toString(){
        return this.idsub+ " " + this.namesub + " "+ this.fomat;
    }
    @Override
    public int compareTo(Subject a){
        return this.getidsub().compareTo(a.getidsub());
    }
}