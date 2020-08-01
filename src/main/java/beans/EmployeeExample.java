package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeExample {

  static List<Employee> findEmployeeCondition1(List<Employee> employees) {
    List<Employee> foundEmployee = new ArrayList<>();
    for (Employee employee : employees) {
      if (employee.getSalary() > 1000 & employee.getGender().equals("Female")) {
        foundEmployee.add(employee);
      }
    }
    return foundEmployee;
  }

  static List<Employee> findEmployeeCondition2(List<Employee> employees) {
    List<Employee> foundEmployee = new ArrayList<>();
    for (Employee employee : employees) {
      if (employee.getSalary() <= 1000) {
        foundEmployee.add(employee);
      }
    }
    return foundEmployee;
  }
  static List<Employee> findAllEmployeeAreMale(List<Employee> employees) {
    List<Employee> foundEmployee = new ArrayList<>();
    for (Employee employee : employees) {
      if (employee.getGender().equals("Male")) {
        foundEmployee.add(employee);
      }
    }
    return foundEmployee;
  }

  static List<Employee> findEmployee(List<Employee> employees, Predicate<Employee> employeePredicate) {
    List<Employee> foundEmployee = new ArrayList<>();
    for (Employee employee : employees) {
      if (employeePredicate.test(employee)){
        foundEmployee.add(employee);
      }
    }
    return foundEmployee;
  }


  public static void main(String[] args) {
    List<Employee> employees = List.of(new Employee("Sara", 20, "Female", 3000),
        new Employee("Dara", 31, "Male", 1000),
        new Employee("Kimleng", 21, "Male", 500),
        new Employee("Kanha", 25, "Male", 1500));

    System.out.println(findEmployeeCondition1(employees));
    System.out.println(findEmployeeCondition2(employees));
    System.out.println(findAllEmployeeAreMale(employees));

    findEmployee(employees, employee -> employee.getSalary()>1000 & employee.getGender().equals("Female"));
    findEmployee(employees, employee -> employee.getSalary()<=1000 );
    findEmployee(employees, employee -> employee.getGender().equals("Male"));

  }

}
