package exc06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 1){
            System.out.printf("Испльзование: ShowFile ");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if(i != -1) System.out.print((char)i);
            }while(i != -1);
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден.");
        }catch(IOException e){
            System.out.println("Произошла ошибка ввада-вывода.");
        }
    }
}
