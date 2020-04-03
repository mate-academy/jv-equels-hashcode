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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (null == o || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(width, rectangle.width)
                && Objects.equals(length, rectangle.length)
                && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return (31 * (width == null ? 0 : width.hashCode()))
                + (15 * (length == null ? 0 : length.hashCode()))
                + (7 * (color == null ? 0 : color.hashCode()));
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
