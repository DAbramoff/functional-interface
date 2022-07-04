package interfaces.supplier;

import java.util.Date;

public class SupplierImpl {
    public static void main(String[] args) throws InterruptedException {
        Supplier<String> stringSupplier = ()-> "Текущее время " + new Date();
        System.out.println(stringSupplier.get());
        Thread.sleep(10000);
        System.out.println(stringSupplier.get());
    }
}
