import java.io.*;

public class Xulinhapxuat
{
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\fpt\\OneDrive\\Máy tính\\test.txt") ;
            FileOutputStream fos = new FileOutputStream(f);
          //  ObjectOutputStream dos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(f);
//            ObjectInputStream ois = new ObjectInputStream(fis);
            FileWriter fw = new FileWriter(f);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
         //   String line;
       //     while((line = br.readLine()) != null){
       //         System.out.println(line);
         //   }
            fis.close();
//            ois.close();
//            dos.close();
            fos.close();
            fw.write("Anh Thong Dep Trai vcl ");
            //dos.writeDouble(3.4);
        //    dos.close();
            fw.close();
          fr.close();
            br.close();
        }
        catch (IOException e){
            System.out.println("loi ghi file");
        }
    }
}
class Animal implements  Serializable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}