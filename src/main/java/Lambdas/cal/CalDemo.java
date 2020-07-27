package Lambdas.cal;

import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class CalDemo {

  public static void main(String[] args) {
    Calculator<Integer> sum = (a, b, consumer) -> consumer.accept(a + b);
    sum.cal(10, 20, System.out::println);

    Calculator<Integer> multiply = (a, b, consumer) -> consumer.accept(a * b);
    multiply.cal(10, 20, integer -> System.out.println(integer));
    multiply.cal(10, 20, CalDemo::echo);

  }

  static Integer returnVal(){
    return 100;
  }
  static void echo(Integer result){
    System.out.println("Echo result =>"+result);
  }
}

@FunctionalInterface
interface Calculator<T> {
  void cal(T value1, T value2, Consumer<T> consumer);
}