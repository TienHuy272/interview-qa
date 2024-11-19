package hnt.coding.interview.core.functional.inteface;

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
    }
}
