import java.util.stream.IntStream;

public class HelloWorld {
    public static void main(String[] args) {
        IntStream.range(1, 20).forEach(index -> System.out.println("Hello World! " + index));
    }
}
