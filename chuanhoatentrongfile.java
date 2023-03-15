import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class chuanhoatentrongfile {
    public static void main(String[] args) throws IOException {
            File f = new File("DATA.in");
            FileInputStream fis = new FileInputStream(f);
            Scanner sc = new Scanner(fis);
            while(sc.hasNextLine() ){
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                String res="";
                while(st.hasMoreTokens()){
                    String word = st.nextToken();
                    if(word.equals("END")) break;
                    word =word.toLowerCase();
                    char x = Character.toUpperCase(word.charAt(0));
                    res += String.valueOf(x) + word.substring(1)+" ";
                }
                System.out.println(res);
            }
            sc.close();
            fis.close();

    }
}
