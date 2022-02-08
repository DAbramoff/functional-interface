package interfaces.supplier;

public class SupplierImpl {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = (x)-> "Новая строка № " + x;
        System.out.println(stringSupplier.get(1));
        System.out.println(stringSupplier.get(2));
    }
}
