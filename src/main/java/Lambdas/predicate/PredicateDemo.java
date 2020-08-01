package Lambdas.predicate;

import beans.Student;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

  static void isMatchStudent(List<Student> students, Predicate<Student> predicate) {

    for (Student student : students) {
      if (predicate.test(student)) {
        System.out.println("Matched student:" + student);
      }
    }
  }

  static void isMatchStudentWithoutFunctional(List<Student> students) {
    for (Student student : students) {
      if (student.getAge() > 30 & student.getGender().equals("Female")) {
        System.out.println("Matched student:" + student);
      }
    }
  }


  public static void main(String[] args) {
    List<Student> students = List
        .of(new Student("Yewin", 20, "Male"), new Student("Dara", 30, "Male"),
            new Student("Sara", 40, "Female"));

    isMatchStudent(students,
        student -> student.getAge() > 20 && student.getGender().equals("Female"));
    isMatchStudentWithoutFunctional(students);

  }
}
