package task.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFileExceptionHandling {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);




        //Задача 1
        FileCreator fileCreator = new FileCreator();
        String massage = scanner.nextLine();
        fileCreator.createFile(massage);

        //Задача 2
        CreatorFileTheConsole creatorFileTheConsole = new CreatorFileTheConsole();
        creatorFileTheConsole.createFileViaTheConsole();

        //Задача 3
        int firstNumber = 10;
        int secondNumber = 2;

        System.out.println("метод, который делит два числа и возвращает результат.");
        divisionOfNumbersAndExclusion(firstNumber, secondNumber);
        System.out.println(divisionOfNumbersAndExclusion(firstNumber, secondNumber));

        //Задача 4
        NumberSquare numberSquare = new NumberSquare();
        numberSquare.squareOfTheNumber();

        //5 задача
        BankAccount bankAccount = new BankAccount(10000);
        bankAccount.makePurchase();


        //6 задача
        PrintReadTheFile printReadTheFile = new PrintReadTheFile();
        FileReader reader = null;
        printReadTheFile.printTextFromFile(reader);


        //7 задача
        String line = "Привет";
        convertingStringToANumber(line);

        //8 задача
        List<String> students = List.of("Мария", "Степан", "Игорь");
        String studentName = "Илья";
        PlentyStudents plentyStudents = new PlentyStudents();
        plentyStudents.addingStudentsToTheList(students, studentName);

        //9 задача
        DividingNumbers dividingNumbers = new DividingNumbers();
        dividingNumbers.undressedFirstAndSecondNumber();

        //10 задача

        Car car = new Car();
        car.startingTheEngine();

        //11 задача
        NewFile newFile = new NewFile();
        newFile.createFileByConsole();


    }

    // Реализуйте функциональность согласно описанию

    //     TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
    //      строкой


    // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
    //  введенного текста создается файл


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


    // TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
    //  счета. Обработайте исключение, если на счете недостаточно средств.


    // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
    //  исключение, если файл не найден.


    // TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
    //  может быть преобразована в число.
    public static void convertingStringToANumber(String line) throws NumberFormatException {
        try {
            int str = Integer.parseInt(line);
            System.out.println(str);
        } catch (NumberFormatException e) {
            System.out.println("не верный формат");

        }
    }


    // TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
    //  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.


    // TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
    //  исключение, если введены некорректные данные (например, вместо числа введена строка).


    // TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
    //  Обработайте исключение, если двигатель уже запущен.


    // TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
    //  считывает первое слово из файла


}