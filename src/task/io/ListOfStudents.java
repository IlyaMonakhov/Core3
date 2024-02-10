package task.io;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {
    public static void main(String[] args) {


        // TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
        //  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.
        List<String> listOfStudents = new ArrayList<>();
        listOfStudents.add("Мария");
        listOfStudents.add("Степан");
        listOfStudents.add("Игорь");
        String studentName = "Илья";
        addingStudentsToTheList(listOfStudents,studentName);
        System.out.println(listOfStudents);


    }
    public static void addingStudentsToTheList( List<String> listOfStudents, String studentName ){
        try {
            if (listOfStudents.contains(studentName)){
                throw new RuntimeException();

            }else {
                listOfStudents.add(studentName);
            }
        } catch (RuntimeException e) {
            System.out.println("Такой студент уже есть");
        }
    }

}
