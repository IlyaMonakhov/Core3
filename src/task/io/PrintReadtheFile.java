package task.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintReadtheFile {
    public static void main(String[] args) throws Exception {
        // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
        //  исключение, если файл не найден.
        FileReader reader = null;
            try {
                reader = new FileReader("C:\\Users\\Пользователь\\Desktop\\File.txt.txt");
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);

                }

            } catch (IOException e) {
                System.out.println("Файл не найдет");
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
