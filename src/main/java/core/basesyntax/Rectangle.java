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

    @Override
    public boolean equals(Object figure) {
        if (this == figure) {
            return true;
        }
        if (figure == null) {
            return false;
        }
        if (figure.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) figure;
            return color.equals(rectangle.color)
                    && width.equals(rectangle.width)
                    && length.equals(rectangle.length);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + width.hashCode();
        result = 31 * result + length.hashCode();
        result = 31 * result + color.hashCode();
        return result;
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
}
