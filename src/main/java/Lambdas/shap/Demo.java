package Lambdas.shap;

import beans.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    Student phea = new Student("Phea Soy", 27);
    Student dara = new Student("SiDara Keo", 30);
    Student kosal = new Student("Kosal Din", 28);

    List<Student> students = new ArrayList();
    students.add(phea);
    students.add(kosal);
    students.add(dara);
    print(students);

    // Without lambda express
    Collections.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    print(students);

    //With lambda
    Collections.sort(students, (stud1,stud2) -> stud1.getName().compareTo(stud2.getName()));
    print(students);

  }

  public static void print(List<Student> students) {
    System.out.println("========================");
    for (Student student : students) {
      System.out.println(student.getName());
    }
  }
}


