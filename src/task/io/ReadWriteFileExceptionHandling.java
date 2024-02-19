package task.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFileExceptionHandling {
    public static void main(String[] args) throws Exception {

        //Задача 1
        CreatingFile creatingFile = new CreatingFile();
        CreatingFile.creatingFile();

        //Задача 2
        CreatingFileRecordConsole creatingFileRecordConsole = new CreatingFileRecordConsole();
        CreatingFileRecordConsole.fileRecordConsole();

        //Задача 3
        int firstNumber = 10;
        int secondNumber = 2;

        System.out.println("метод, который делит два числа и возвращает результат.");
        divisionOfNumbersAndExclusion(firstNumber, secondNumber);
        System.out.println(divisionOfNumbersAndExclusion(firstNumber, secondNumber));

        //Задача 4
        NumberSquare numberSquare = new NumberSquare();
        NumberSquare.squareOfTheNumber();

        //5 задача
        BankAccount bankAccount = new BankAccount();
        int wallet = 10000;
        Scanner console = new Scanner(System.in);
        int withdrawal = console.nextInt();
        BankAccount.withdrawalOfMoney(wallet, withdrawal);

        //6 задача
        PrintReadTheFile printReadTheFile = new PrintReadTheFile();
        PrintReadTheFile.printData();


        //7 задача
        String line = "Привет";
        convertingAStringToANumber(line);

        //8 задача
        List<String> students = List.of("Мария", "Степан", "Игорь");
        String studentName = "Илья";
        ListOfStudents listOfStudents = new ListOfStudents();
        ListOfStudents.addingStudentsToTheList(students, studentName);

        //9 задача
        DividingNumbers dividingNumbers = new DividingNumbers();
        DividingNumbers.dividingNum();

        //10 задача

        Car car = new Car();
        Car.startingTheEngine();

        //11 задача
        NewFile newFile = new NewFile();
        NewFile.fileFromTheText();


    }

    // Реализуйте функциональность согласно описанию

    //     TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
    //      строкой
    public static void creatingFile() throws IOException {
        String expression = "Привет , меня зовут Илья . Я учу Java";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Пользователь\\Desktop\\File.txt");
            for (int i = 0; i < expression.length(); i++) {
                writer.write(expression.charAt(i));
            }
            System.out.println("Файл создан и записан");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }


    }

    // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
    //  введенного текста создается файл
    public static void fileRecordConsole() throws IOException {
        Scanner console = new Scanner(System.in);
        String plans = console.nextLine();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Пользователь\\Desktop\\FileConsole.txt");
            fileWriter.write(plans);
            System.out.println("Файл создан и записан.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();

        }
    }


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
    public void squareOfTheNumber() {
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Введите число");
            int number = console.nextInt();
            int square = number * number;
            System.out.println(square);
        } catch (InputMismatchException e) {
            System.out.println("Исключение перехвачено");
        }

    }


    // TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
    //  счета. Обработайте исключение, если на счете недостаточно средств.
    public static int withdrawalOfMoney(int wallet, int withdrawal) {
        try {
            int remains = wallet - withdrawal;
            if (withdrawal < wallet) {
                System.out.println("Остаток" + remains);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
    //  исключение, если файл не найден.
    public static void printData() throws Exception {
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


    // TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
    //  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.
    public static void addingStudentsToTheList(List<String> students, String studentName) {
        try {
            if (students.contains(studentName)) {
                throw new RuntimeException();

            } else {
                students.add(studentName);
            }
        } catch (RuntimeException e) {
            System.out.println("Такой студент уже есть");
        }
    }

    // TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
    //  исключение, если введены некорректные данные (например, вместо числа введена строка).
    public static void dividingNum() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");

        System.out.println("Введите второе целое число: ");


        try {
            int first = input.nextInt();
            int second = input.nextInt();
            int result = first / second;

            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        } catch (InputMismatchException e) {
            System.out.println("Не верный формат");
        }

    }

    // TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
    //  Обработайте исключение, если двигатель уже запущен.
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

    // TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
    //  считывает первое слово из файла
    public static void fileFromTheText() {
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