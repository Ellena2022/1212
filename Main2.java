import java.io.*;
public class Main2 {
    public static void main(String[] args) throws IOException {
     FileReader nt= new FileReader("C://Users/User/Desktop/елена/Работа с файлами/new.txt");
     int rt;
     while ((rt= nt.read())!=-1){
         System.out.print((char)rt);
     }
    }
}
