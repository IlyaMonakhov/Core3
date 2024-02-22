package task.io;

import java.util.ArrayList;
import java.util.List;

public class PlentyStudents {
    public void listStudents() {


        // TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
        //  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.
        List<String> students = new ArrayList<>();
        students.add("Мария");
        students.add("Степан");
        students.add("Игорь");
        String studentName = "Илья";
        addingStudentsToTheList(students,studentName);
        System.out.println(students);


    }
    public void addingStudentsToTheList( List<String> listOfStudents, String studentName ){
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
