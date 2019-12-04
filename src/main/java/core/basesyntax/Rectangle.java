package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        return 26 * getLength() * getWidth()
            * (getColor().length() != 0 ? getColor().length() : 0);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        return this.getColor().equals(rectangle.getColor())
            && this.getWidth().equals(rectangle.getWidth())
            && this.getLength().equals(rectangle.getLength())
            && this.getClass().equals(rectangle.getClass());
    }

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(300, 400, "Red");
        Rectangle secondRectangle = new Rectangle(300, 400, "Red");
        System.out.println(firstRectangle.equals(secondRectangle));
    }
}
