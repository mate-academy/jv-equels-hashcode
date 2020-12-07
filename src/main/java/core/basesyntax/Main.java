package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(5, 5, "C");
        Rectangle rectangleSecond = new Rectangle(5, 5, "C");

        System.out.println(rectangleFirst.hashCode());
        System.out.println(rectangleSecond.hashCode());

        System.out.println(rectangleFirst.equals(rectangleSecond));
    }
}
