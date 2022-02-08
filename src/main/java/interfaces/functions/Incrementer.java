package interfaces.functions;

public class Incrementer implements Function<Long, Long> {
    @Override
    public Long apply(Long value) {
        return ++value;
    }
}
