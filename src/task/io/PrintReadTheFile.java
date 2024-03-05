package task.io;

import java.io.FileReader;
import java.io.IOException;

public class PrintReadTheFile {
    public void printTextFromFile() throws Exception {
        // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
        //  исключение, если файл не найден.
        FileReader reader = new FileReader("C:\\Users\\Пользователь\\Desktop\\File.txt");
            try {
                reader = new FileReader("C:\\Users\\Пользователь\\Desktop\\File.txt");
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);

                }

            } catch (IOException e) {
                System.out.println("Файл не найден");
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка");
                }
            }
        }
    }
