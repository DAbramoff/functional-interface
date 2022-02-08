package interfaces.predicate;

public class CheckForEmptyStringPredicate implements Predicate<String> {
    @Override
    public boolean test(String param) {
        return param.isEmpty();
    }
}
