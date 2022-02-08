import interfaces.FunctionalInterface_1;
import interfaces.FunctionalInterface_2;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface_1 interface_1 = () -> {
            System.out.println("Hello!");
        };
        interface_1.method();

        FunctionalInterface_2 interface_2 = () -> {
            System.out.println("Hello!");
        };
        interface_2.method();
    }
}
