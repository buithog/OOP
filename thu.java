import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class thu {
        public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           String name = sc.nextLine(), id = sc.nextLine();
           int age = sc.nextInt();
            try {
                checkStudentException(name,age,id);
            } catch (InputMismatchException e) {
                System.out.println("may la thang ngu");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("rest of the code...");
        }
        public static void checkStudentException(String name,int age,String id) throws Exception{
            if(id.charAt(0) != 'B') throw new Exception("Nhap ten ngu");
        }
}
