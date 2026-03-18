class Test {
    static void hello() {
        System.out.println("Hello");
    }
}
public class Static {
    public static void main(String[] args) {
        Test.hello(); // Call static method directly
    }
}