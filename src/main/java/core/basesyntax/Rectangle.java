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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) o;
            return width.equals(rectangle.width)
                    && length.equals(rectangle.length)
                    && color.equals(rectangle.color);
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = 12;
        result = 5 * result + width.hashCode();
        result = 5 * result + length.hashCode();
        result = 5 * result + color.hashCode();
        return result;
    }
}
