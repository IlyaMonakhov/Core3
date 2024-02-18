package task.io;

import java.io.*;
import java.util.Scanner;

public class NewFile {
    public static void fileFromTheText() {
        // TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
        //  считывает первое слово из файла
        Scanner console = new Scanner(System.in);
        FileWriter writer = null;
        try {
            System.out.println("Введите текст для записи в файл:");
            String text = console.nextLine();

            File file = new File("C:\\Users\\Пользователь\\Desktop\\Str.txt");


            if (!file.exists()) {
                file.createNewFile();
            }

            writer = new FileWriter(file);
            writer.write(text);
            System.out.println("Файл создан и записан!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\Пользователь\\Desktop\\Str.txt");
            Scanner fileScanner = new Scanner(reader);
            String firstWord = fileScanner.next();
            System.out.println("Первое слово из файла: " + firstWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
