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
    public boolean equals(Object shape) {
        if (shape == this) {
            return true;
        }
        if (shape == null) {
            return false;
        }
        if (shape.getClass().equals(Rectangle.class)) {
            Rectangle current = (Rectangle) shape;
            return ((this.length == current.length || this.length != null && this.length.equals(current.length)))
                    && ((this.width == current.width || this.width != null && this.width.equals(current.width)))
                    && ((this.color == current.color || this.color != null && this.color.equals(current.color)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        return result;
    }
}
