package task.io;

import java.util.Scanner;

public class Car {
    private boolean engineRunning;

    public Car() {
        this.engineRunning = false;
    }

    public void startingTheEngine() {
        Scanner console = new Scanner(System.in);

        try {
            System.out.println("Введите (1) для запуска двигателя");
            String engine = console.next();

            if (!engine.equals("1")) {
                throw new Exception("Ошибка: Введите только цифру 1 для запуска двигателя");
            }

            if (engineRunning) {
                throw new Exception("Ошибка: Двигатель уже запущен");
            } else {
                engineRunning = true;
                System.out.println("Двигатель запущен");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.