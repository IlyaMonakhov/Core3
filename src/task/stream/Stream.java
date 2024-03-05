package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Stream {
    public static void main(String[] args) {

        int i = addingTwoNumbersBinaryOperator();
        System.out.println("Ответ: " + i);


        System.out.println(listOfWordsPredicate());



        functionNumbersSquared();


        upperCaseStrings();

        //Stream
        Scanner scanner = new Scanner(System.in);

        //1 задача
        System.out.println("Напишите целые числа");
        List<Integer> integers = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamSumNumbers streamSumNumbers = new StreamSumNumbers();
        streamSumNumbers.sumNumbers(integers);
        System.out.println(streamSumNumbers.sumNumbers(integers));


        //2 задача
        List<Integer> listSecond = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamAverageValue streamAverageValue = new StreamAverageValue();
        streamAverageValue.getAverageValue(listSecond);
        System.out.println(streamAverageValue.getAverageValue(listSecond));


        //3 задача
        List<Integer> listFive = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите числа");
        StreamMaxNumber streamMaxNumber = new StreamMaxNumber();
        streamMaxNumber.maxElement(listFive);
        System.out.println(streamMaxNumber.maxElement(listFive));


        //4 задача
        List<Integer> listSix = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите числа");
        StreamMinNumber streamMinNumber = new StreamMinNumber();
        streamMinNumber.minElement(listSix);
        System.out.println(streamMinNumber.minElement(listSix));


        //5 задача
        System.out.println("Введите числа , которые будут добавлены в список");
        List<Integer> listSeven = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите элемент , который будем проверять");
        int element = scanner.nextInt();
        StreamAnyMatch streamAnyMatch = new StreamAnyMatch();
        streamAnyMatch.anyMatch(listSeven, element);
        boolean containsElement = streamAnyMatch.anyMatch(listSeven, element);
        System.out.println(containsElement);

        //6 задача
        System.out.println("Введите элементы которые будут добавлены в список");
        List<Integer> listEight = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamDistinct streamDistinct = new StreamDistinct();
        streamDistinct.distinctNumber(listEight);
        System.out.println(streamDistinct.distinctNumber(listEight));

        //7 задача
        List<String> listTen = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        StreamMap streamMap = new StreamMap();
        streamMap.listLengths(listTen);
        System.out.println(streamMap.listLengths(listTen));

        //8 задача
        List<String> listEleven = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        StreamConnect streamConnect = new StreamConnect();
        streamConnect.connectingStrings(listEleven);
        System.out.println(streamConnect.connectingStrings(listEleven));

        //9 задача
        List<Integer> listTwelve = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamFilter streamFilter = new StreamFilter();
        streamFilter.filter(listTwelve);
        System.out.println(streamFilter.filter(listTwelve));


    }

    //Реализуйте функциональность согласно описанию

    // TODO: Напишите метод, который принимает два числа от пользователя и использует функциональный интерфейс BinaryOperator
    //  для сложения этих чисел и вывода результата.
    public static int addingTwoNumbersBinaryOperator() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first = console.nextInt();
        System.out.println("Введите второе число:");
        int second = console.nextInt();
        BinaryOperator<Integer> sum = (a, b) -> first + second;
        return sum.apply(first, second);
    }

    // TODO: Напишите метод, который принимает список слов от пользователя и использует функциональный интерфейс Predicate
    //  для фильтрации слов, начинающихся с определенной буквы, и вывода отфильтрованного списка.

    public static List<String> listOfWordsPredicate() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите букву , по которой будет фильтр слов");
        String startingLetter = scn.nextLine();
        Predicate<String> startsWithLetter = element -> element.startsWith(startingLetter);
        System.out.println("Введите список слов:");
        List<String> words = List.of(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());

        List<String> filteredWords = new ArrayList<>();
        for (String element : words) {
            if (startsWithLetter.test(element)) {
                filteredWords.add(element);
            }
        }

        return filteredWords;
    }


    // TODO: Напишите метод, который принимает список чисел от пользователя и использует функциональный интерфейс Function
    //  для преобразования каждого числа в его квадрат и вывода списка квадратов.
    public static void functionNumbersSquared() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        List<Integer> listNumbers = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Function<Integer, Integer> function = i -> i * i;
        for (Integer number : listNumbers) {
            System.out.println("Вывод числа в квадрате: " + function.apply(number));
        }
    }


    // TODO: Напишите метод, который принимает список строк от пользователя и использует функциональный интерфейс Consumer
    //  для вывода каждой строки в верхнем регистре.
    public static List<String> upperCaseStrings() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки");
        List<String> listOfLines = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

        Consumer<String> listOfLinesConsumer = line -> System.out.println(line.toUpperCase());

        for (String line : listOfLines) {
            listOfLinesConsumer.accept(line);
        }

        return listOfLines;
    }


    // TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
    //  входных данных и вычисляет их сумму с использованием стримов.


// TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
//  входных данных и вычисляет их среднее значение с использованием стримов.


    // TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наибольшее число с использованием стримов.


    // TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наименьшее число с использованием стримов.



    // TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
    //  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
    //  стримов.


    // TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
    //  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.


    // TODO: Преобразовать список строк в список их длин. Описание: Напишите программу, которая принимает список строк в
    //  качестве входных данных и преобразует его в список их длин с использованием стримов.


    // TODO: Соединить все строки из списка в одну строку. Описание: Напишите программу, которая принимает список строк в
    //  качестве входных данных и соединяет их все в одну строку с использованием стримов.


    // TODO: Отфильтровать список чисел, оставив только четные числа. Описание: Напишите программу, которая принимает список
    //  чисел в качестве входных данных и фильтрует его, оставляя только четные числа с использованием стримов.

}