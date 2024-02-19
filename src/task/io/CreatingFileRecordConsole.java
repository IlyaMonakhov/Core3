package task.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFileRecordConsole {
    public void fileRecordConsole() throws IOException {


        // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
        //  введенного текста создается файл
        Scanner console = new Scanner(System.in);
        String plans = console.nextLine();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Пользователь\\Desktop\\FileConsole.txt");
            fileWriter.write(plans);
            System.out.println("Файл создан и записан.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileWriter.close();

        }
    }

}
