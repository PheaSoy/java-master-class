import java.util.stream.Stream;

public class StreamDemo {

  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("Apple", "Orange", "Banana", "Apple");
    System.out.println(stream1.peek(System.out::println).distinct().count());


  }

}
