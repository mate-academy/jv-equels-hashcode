package core.basesyntax;

import java.util.Objects;

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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return Objects.equals(width, rectangle.width)
                && Objects.equals(length, rectangle.length)
                && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        if (width == null || length == null || color == null) {
            return 0;
        }
        int result = 22;
        result = 17 * result * width.hashCode();
        result = 17 * result * length.hashCode();
        result = 17 * result * color.hashCode();
        return result;
    }
}
