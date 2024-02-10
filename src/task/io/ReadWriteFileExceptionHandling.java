package task.io;

import java.io.IOException;

public class ReadWriteFileExceptionHandling {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 2;

        System.out.println("метод, который делит два числа и возвращает результат.");
        divisionOfNumbersAndExclusion(firstNumber, secondNumber);
        System.out.println(divisionOfNumbersAndExclusion(firstNumber, secondNumber));

        String line = "Привет";
        convertingAStringToANumber(line);


    }

    // Реализуйте функциональность согласно описанию

//     TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
//      строкой
//    CreatingFile;

    // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
    //  введенного текста создается файл
//    CreatingFileRecordConsole

    // TODO: Создайте метод, который делит два числа и возвращает результат. Обработайте исключение,
    //  если второе число равно нулю
    public static int divisionOfNumbersAndExclusion(int firstNumber, int secondNumber) {
        try {
            return firstNumber / secondNumber;

        } catch (ArithmeticException e) {
            System.out.println("Перехвачено");
            return -1;

        }
    }


    // TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Обработайте
    //  исключение, если введено не число
//   NumberSquare

    // TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
    //  счета. Обработайте исключение, если на счете недостаточно средств.
//BankAccount

    // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
    //  исключение, если файл не найден.
//PrintReadtheFile
    // TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
    //  может быть преобразована в число.
    public static void convertingAStringToANumber(String line) throws NumberFormatException {
        try {
            int str = Integer.parseInt(line);
            System.out.println(str);
        } catch (NumberFormatException e) {
            System.out.println("не верный формат");

        }
    }
}


// TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
//  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.
//ListOfStudents
// TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
//  исключение, если введены некорректные данные (например, вместо числа введена строка).
//DividingNumbers
// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.
//Car
// TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
//  считывает первое слово из файла
//NewFile