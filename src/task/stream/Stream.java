package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        addingTwoNumbersBinaryOperator();

        listOfWordsPredicate();

        functionNumbersSquared();

        upperCaseStrings();

        //Stream

        //1 задача
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        sumNumbers(integers);
        StreamSumNumbers streamSumNumbers = new StreamSumNumbers();
        StreamSumNumbers.sumNumbers(integers);
        System.out.println(StreamSumNumbers.sumNumbers(integers));


        //2 задача
        List<Integer> listSecond = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamAverageValue streamAverageValue = new StreamAverageValue();
        StreamAverageValue.averageValue(listSecond);
        System.out.println(StreamAverageValue.averageValue(listSecond));


        //3 задача
        List<Integer> listFive = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamMaxNumber streamMaxNumber = new StreamMaxNumber();
        StreamMaxNumber.maxElement(listFive);
        System.out.println(StreamMaxNumber.maxElement(listFive));


        //4 задача
        List<Integer> listSix = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        minElement(listSix);
        StreamMinNumber streamMinNumber = new StreamMinNumber();
        StreamMinNumber.minElement(listSix);
        System.out.println(StreamMinNumber.minElement(listSix));


        //5 задача
        List<Integer> listSeven = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int element = scanner.nextInt();
        StreamAnyMatch streamAnyMatch = new StreamAnyMatch();
        streamAnyMatch.anyMatch(listSeven, element);
        boolean containsElement = anyMatch(listSeven, element);
        System.out.println(containsElement);

        //6 задача

        List<Integer> listEight = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamDistinct streamDistinct = new StreamDistinct();
        StreamDistinct.distinctNumber(listEight);
        System.out.println(distinctNumber(listEight));

        //7 задача
        List<String> listTen = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        StreamMap streamMap = new StreamMap();
        StreamMap.listLengths(listTen);
        System.out.println(listLengths(listTen));

        //8 задача
        List<String> listEleven = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        StreamConnecting streamConnecting = new StreamConnecting();
        StreamConnecting.connectingStrings(listEleven);
        connectingStrings(listEleven);
        System.out.println(connectingStrings(listEleven));

        //9 задача
        List<Integer> listTwelve = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamFilter streamFilter = new StreamFilter();
        StreamFilter.filter(listTwelve);
        System.out.println(filter(listTwelve));


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
        String startingLetter = "P";
        Predicate<String> startsWithLetter = element -> element.startsWith(startingLetter);
        System.out.println("Введите список слов:");
        List<String> words = new ArrayList<>();
        words = List.of(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());

        List<String> filteredList = new ArrayList<>();
        for (String element : words) {
            if (startsWithLetter.test(element)) {
                filteredList.add(element);
            }
        }

        return filteredList;

    }


    // TODO: Напишите метод, который принимает список чисел от пользователя и использует функциональный интерфейс Function
    //  для преобразования каждого числа в его квадрат и вывода списка квадратов.
    public static List<Integer> functionNumbersSquared() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Function<Integer, Integer> function = i -> i * i;
        for (Integer number : listNumbers) {
            System.out.println("Вывод списка в квадрате: " + function.apply(number));
        }

        return listNumbers;
    }


    // TODO: Напишите метод, который принимает список строк от пользователя и использует функциональный интерфейс Consumer
    //  для вывода каждой строки в верхнем регистре.
    public static List<String> upperCaseStrings() {

        Scanner scanner = new Scanner(System.in);
        List<String> listOfLines = new ArrayList<>();
        listOfLines = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

        Consumer<String> listOfLinesConsumer = line -> System.out.println(line.toUpperCase());

        for (String line : listOfLines) {
            listOfLinesConsumer.accept(line);
        }

        return listOfLines;
    }


    // TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
    //  входных данных и вычисляет их сумму с использованием стримов.
    public static int sumNumbers(List<Integer> integers) {
        int sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum;
    }


// TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
//  входных данных и вычисляет их среднее значение с использованием стримов.

    public static int averageValue(List<Integer> listSecond) {
        int sum = listSecond.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum / listSecond.size();
    }


    // TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наибольшее число с использованием стримов.
    public static int maxElement(List<Integer> listFive) {
        Integer max = listFive.stream().max(Integer::compare).get();
        return max;

    }

    // TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
    //  данных и находит наименьшее число с использованием стримов.
    public static int minElement(List<Integer> listSix) {
        Integer min = listSix.stream().min(Integer::compare).get();
        return min;

    }


    // TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
    //  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
    //  стримов.
    public static boolean anyMatch(List<Integer> listSeven, int element) {
        boolean elementFound = listSeven.stream().anyMatch(e -> e == element);
        return elementFound;

    }


    // TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
    //  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.
    public static List<Integer> distinctNumber(List<Integer> listEight) {
        List<Integer> listDistinct = listEight.stream().distinct().collect(Collectors.toList());
        return listDistinct;
    }


    // TODO: Преобразовать список строк в список их длин. Описание: Напишите программу, которая принимает список строк в
    //  качестве входных данных и преобразует его в список их длин с использованием стримов.
    public static List<Integer> listLengths(List<String> listTen) {
        List<Integer> listLength = listTen.stream().map(e -> e.length()).collect(Collectors.toList());
        return listLength;
    }


    // TODO: Соединить все строки из списка в одну строку. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и соединяет их все в одну строку с использованием стримов.
    public static String connectingStrings(List<String> listEleven) {
        String result = listEleven.stream().collect(Collectors.joining());
        return result;
    }


    // TODO: Отфильтровать список чисел, оставив только четные числа. Описание: Напишите программу, которая принимает список
//  чисел в качестве входных данных и фильтрует его, оставляя только четные числа с использованием стримов.
    public static List<Integer> filter(List<Integer> listTwelve) {
        List<Integer> listFilter = listTwelve.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        return listFilter;
    }

}