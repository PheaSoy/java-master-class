package Lambdas.consumer;

import java.util.HashMap;
import java.util.Map;

public class ConsumerDemo {

  public static void main(String[] args) {

    Map<Integer,String> fruits = new HashMap<>();
    fruits.put(1,"Apple");
    fruits.put(2,"Orange");
    fruits.put(1,"Banana");
    fruits.forEach((key,value) -> System.out.println("Key=>"+key+"Value=>"+value));
    fruits.entrySet().forEach(integerStringEntry -> System.out.println("Key:"+integerStringEntry.getKey()+"Val:"+integerStringEntry.getValue()));
  }
}
