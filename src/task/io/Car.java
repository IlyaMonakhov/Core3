package task.io;

import java.util.Scanner;

public class Car {

    public void startingTheEngine() {
        Scanner console = new Scanner(System.in);

        try {
            System.out.println("Введите (1) для запуска двигателя");
            String engine = console.next();
            System.out.println("Введите (2) , чтобы включить фары");
            String headlights = console.next();
            if (engine.equals(headlights)) {
                throw new Exception("Двигетель уже запущен");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.