package interfaces.functions;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (e) -> e * e;
        System.out.println(function.apply(10));
    }
}
