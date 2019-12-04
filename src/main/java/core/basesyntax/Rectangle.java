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
        return 31 * getLength() * getWidth()
            * (getColor() != null ? getColor().length() : 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Rectangle rectangle = (Rectangle) obj;
        return ((Rectangle) obj).getClass().equals(rectangle.getClass())
            && this.getColor().equals(rectangle.getColor())
            && this.getWidth().equals(rectangle.getWidth())
            && this.getLength().equals(rectangle.getLength());
    }
}