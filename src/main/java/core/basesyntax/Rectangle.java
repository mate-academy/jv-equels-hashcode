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
    public boolean equals(Object rect) {
        if (this == rect) {
            return true;
        }
        if (rect == null) {
            return false;
        }
        if (rect.getClass() != Rectangle.class) {
            return false;
        }
        Rectangle rectangle = (Rectangle) rect;
        return width.equals(rectangle.width)
                && length.equals(rectangle.length)
                && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return width.hashCode() * 31 + length.hashCode() * 31 + color.hashCode() * 31;
    }
}
