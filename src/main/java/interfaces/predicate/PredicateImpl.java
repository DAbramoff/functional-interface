package interfaces.predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<String> predicate = (str) -> str.isEmpty();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Not empty"));
    }
}
