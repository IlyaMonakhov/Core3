package task.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatorFileTheConsole {
    public void createFileViaTheConsole() throws IOException {


        // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
        //  введенного текста создается файл
        Scanner console = new Scanner(System.in);
        System.out.println("Введите текст, который будет сохранен в ваш файл.");
        String plans = console.nextLine();
        File file = new File("C:\\Users\\Пользователь\\Desktop\\FileConsole.txt");
        FileWriter fileWriter = null;
        try {
            if (file.exists()) {
                System.out.println("Такой файл уже существует.");
            } else {
                fileWriter = new FileWriter(file);
                fileWriter.write(plans);
                System.out.println("Файл создан и записан.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }
}
