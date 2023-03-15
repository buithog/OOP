package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class hellofile{
    public static void main(String [] args) throws FileNotFoundException  {
        Scanner read = new Scanner(new File("Hello.txt"));
        while(read.hasNext()){
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }

}
