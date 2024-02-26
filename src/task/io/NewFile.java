package task.io;

import java.io.*;
import java.util.Scanner;

public class NewFile {
    public void createFileByConsole() {
        // TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
        //  считывает первое слово из файла
        try (Scanner console = new Scanner(System.in);
             FileWriter writer = new FileWriter("C:\\Users\\Пользователь\\Desktop\\Str.txt")) {

            System.out.println("Введите текст для записи в файл:");
            String text = console.nextLine();

            writer.write(text);
            System.out.println("Файл создан и записан!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader reader = new FileReader("C:\\Users\\Пользователь\\Desktop\\Str.txt");
             Scanner fileScanner = new Scanner(reader)) {

            String firstWord = fileScanner.next();
            System.out.println("Первое слово из файла: " + firstWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
