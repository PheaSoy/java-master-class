package Lambdas.student;

import beans.Student;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentDemo {

  public static void main(String[] args) {

    List<Student> students = List
        .of(new Student("Yewin", 20), new Student("Dara", 30), new Student("Kimleng", 40));

    StudentFunctionalInterface studentFunction = (stus, predicate, consumer) -> { stus.stream().filter(predicate).forEach(consumer); };
    studentFunction.execute(students, student -> student.getAge() > 30, StudentDemo::saveToDb);
    studentFunction.execute(students, student -> student.getName().contains("D"), StudentDemo::saveToDb);
    studentFunction.execute(students, student -> student.getAge() >= 20, StudentDemo::saveToDb);
  }

  static void saveToDb(Student student) {
    System.out.println("Save to db with student:" + student);
  }
}

@FunctionalInterface
interface StudentFunctionalInterface {
  void execute(List<Student> student, Predicate<Student> predicate, Consumer<Student> consumer);
}
