package function;

import beans.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

  static Function<List<Employee>, List<Employee>> employeeContainName(String containName) {
    Function<List<Employee>, List<Employee>> function = (employees) -> {
      return employees.stream().filter(emp -> emp.getName().contains(containName))
          .collect(Collectors.toList());
    };
    return function;
  }

  static Function<List<Employee>, List<Employee>> employeeWithGender(String gender) {
    Function<List<Employee>, List<Employee>> function = (employees) -> {
      return employees.stream().filter(emp -> emp.getGender().equals(gender))
          .collect(Collectors.toList());
    };
    return function;
  }

  static Function<List<Employee>, Integer> countEmployee() {
    Function<List<Employee>, Integer> function = employees -> employees.size();
    return function;
  }


  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Dara", 29, "Male", 1500));
    employees.add(new Employee("Seyha", 27, "Male", 1000));
    employees.add(new Employee("Kanha", 25, "Female", 900));

    Integer result = employeeContainName("h")
        .andThen(employeeWithGender("Male"))
        .andThen(countEmployee()).apply(employees);

    System.out.println("Number of employee:"+result);

  }

}
