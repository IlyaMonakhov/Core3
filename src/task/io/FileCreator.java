package task.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
    public void createFile(String massage) throws IOException {
//        TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
//         строкой
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Пользователь\\Desktop\\File.txt");
            for (int i = 0; i < massage.length(); i++) {
                writer.write(massage.charAt(i));
            }
            System.out.println("Файл создан и записан");
        } catch (IOException e){
            System.out.println("Возникла ошибка");
        } finally {
            writer.close();
        }


    }
}
