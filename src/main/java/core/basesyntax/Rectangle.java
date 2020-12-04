package core.basesyntax;

import java.util.Objects;

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
    public boolean equals(Object rectangle) {
        if (this == rectangle) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle current = (Rectangle) rectangle;
            return Objects.equals(this.color, current.color)
                    && Objects.equals(this.length, current.length)
                    && Objects.equals(this.width, current.width);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
