package hnt.coding.interview.core.functional.inteface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OperationMail {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        Operation<Integer> operation1 = (x,y) -> x * y;
        int result = operation1.calculate(a, b);
        System.out.println(result);

        String x1 = "tien";
        String x2 = "huy";
        Operation<String> operation2 = "%s - %s"::formatted;
        System.out.println(operation2.calculate(x1, x2));

        Predicate<Integer> compareInt = x -> x > 10;
        System.out.println(compareInt.test(100));

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("show me");

        Supplier<String> supplier = () ->  "001";
        System.out.println(supplier.get());

        Function<String, Integer> function = (y) -> y.length();
        System.out.println(function.apply("123"));

    }
}
