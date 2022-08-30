import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter yo = new FileWriter("C://Users/User/Desktop/елена/Работа с файлами/new.txt");
        String TEXT = "Новая строка ";
        yo.write(TEXT);
        yo.append("\n");
        String text="Напишите главу истории";
        yo.write(text);
        yo.close();

    }
}
