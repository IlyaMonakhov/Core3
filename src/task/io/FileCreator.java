package task.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public void createFile() throws IOException {
//        TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
//         строкой
        String expression = "Привет , меня зовут Илья . Я учу Java";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Пользователь\\Desktop\\File.txt");
            for (int i = 0; i < expression.length(); i++) {
                writer.write(expression.charAt(i));
            }
            System.out.println("Файл создан и записан");
        } catch (IOException e){
        } finally {
            writer.close();
        }


    }
}
