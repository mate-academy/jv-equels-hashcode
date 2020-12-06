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
        if (rectangle == this) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle current = (Rectangle) rectangle;
            return Objects.equals(this.width, current.width)
                  && Objects.equals(this.length, current.length)
                  && Objects.equals(this.color, current.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + (width != null ? width.hashCode() : 0)
                + (length != null ? length.hashCode() : 0)
                + (color != null ? color.hashCode() : 0);
        return hashCode;
    }
}
