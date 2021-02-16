import java.util.stream.Stream;
public class FizzBuzz {
    public static void main(String[] args) {
        Stream.iterate(1, (x -> x+1))
                .limit(100)
                .map(x -> (x % 15 == 0) ? "fizzbuzz" : (x % 5 == 0) ? "fizz" : (x % 3 == 0) ? "buzz" : x + "")
                .forEach(System.out::println);
    }
}

