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
    public boolean equals(Object r) {
        if (this == r) {
            return true;
        }
        if (r == null || getClass() != r.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) r;
        return width.equals(rectangle.width)
                && length.equals(rectangle.length)
                && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int result = 13;
        result *= 31 + width.hashCode();
        result *= 31 + length.hashCode();
        result *= 31 + color.hashCode();
        return result;
    }
}
