package core.basesyntax;

public class MyTests {
    public static void startTests() {
        Rectangle rectangle1 = new Rectangle(null, 5, "red");
        Rectangle rectangle2 = new Rectangle(null, 5, "red");
        Rectangle rectangle3 = new Rectangle(2, 3, "green");

        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode() + " = " + rectangle2.hashCode());
        System.out.println();
        System.out.println(rectangle2.hashCode() == rectangle3.hashCode());
        System.out.println(rectangle2.equals(rectangle3));
        System.out.println(rectangle2.hashCode() + " != " + rectangle3.hashCode());
    }
}
