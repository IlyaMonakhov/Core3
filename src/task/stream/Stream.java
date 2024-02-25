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
        System.out.println(i);

        listOfWordsPredicate();

        functionNumbersSquared();

        upperCaseStrings();

        //Stream

        //1 задача
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamSumNumbers streamSumNumbers = new StreamSumNumbers();
        System.out.println(streamSumNumbers.sumNumbers(integers));


        //2 задача
        List<Integer> listSecond = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamAverageValue streamAverageValue = new StreamAverageValue();
        streamAverageValue.getAverageValue(listSecond);
        System.out.println(streamAverageValue.getAverageValue(listSecond));


        //3 задача
        List<Integer> listFive = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamMaxNumber streamMaxNumber = new StreamMaxNumber();
        int max = 0;
        streamMaxNumber.maxElement(listFive,max);
        System.out.println(streamMaxNumber.maxElement(listFive, max));


        //4 задача
        List<Integer> listSix = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamMinNumber streamMinNumber = new StreamMinNumber();
        int min = 0;
        streamMinNumber.minElement(listSix,min);
        System.out.println(streamMinNumber.minElement(listSix,min));


        //5 задача
        List<Integer> listSeven = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int element = scanner.nextInt();
        StreamAnyMatch streamAnyMatch = new StreamAnyMatch();
        boolean elementFound = true;
        streamAnyMatch.anyMatch(listSeven, element, elementFound);
        boolean containsElement = streamAnyMatch.anyMatch(listSeven, element, elementFound);
        System.out.println(containsElement);

        //6 задача

        List<Integer> listEight = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamDistinct streamDistinct = new StreamDistinct();
        List<Integer> listDistinct = new ArrayList<>();
        streamDistinct.distinctNumber(listEight,listDistinct);
        System.out.println(streamDistinct.distinctNumber(listEight,listDistinct));

        //7 задача
        List<String> listTen = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        StreamMap streamMap = new StreamMap();
        List<Integer> listLength = new ArrayList<>();
        streamMap.listLengths(listTen,listLength);
        System.out.println(streamMap.listLengths(listTen,listLength));

        //8 задача
        List<String> listEleven = List.of(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        StreamСonnector streamСonnector = new StreamСonnector();
        String result = null;
        streamСonnector.connectingStrings(listEleven,result);
        System.out.println(streamСonnector.connectingStrings(listEleven,result));

        //9 задача
        List<Integer> listTwelve = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        StreamFilter streamFilter = new StreamFilter();
        List<Integer> listFilter = new ArrayList<>();
        streamFilter.filter(listTwelve,listFilter);
        System.out.println(streamFilter.filter(listTwelve,listFilter));


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
        List<Integer> listNumbers = List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
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