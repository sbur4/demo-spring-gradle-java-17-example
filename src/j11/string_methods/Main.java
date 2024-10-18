package j11.string_methods;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("Java", "Kotlin", "Scala")
                .forEach((var s) -> System.out.println(s.toUpperCase()));
    }
}
