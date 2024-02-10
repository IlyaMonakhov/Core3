package task.io;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        // TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
        //  Обработайте исключение, если двигатель уже запущен.
        startingTheEngine();


    }

    public static void startingTheEngine() {
        Scanner console = new Scanner(System.in);

        try {
            System.out.println("Введите (Старт) для запуска двигателя");
            String engine = console.next();


            System.out.println("Включите фары");
            String headlights = console.next();
            if (engine.equals(headlights)) {
                throw new Exception("Двигетель уже запущен");

            }
        } catch (Exception e) {
            System.out.println("Двигатель уже запущен");
        }
    }


}
