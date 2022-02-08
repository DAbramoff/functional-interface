package interfaces.unaryoperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}
