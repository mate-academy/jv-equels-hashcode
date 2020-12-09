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
        if (rectangle == null) {
            return false;
        }
        Rectangle currentRectangle = (Rectangle) rectangle;
        if (rectangle.getClass().equals(Rectangle.class)) {
            return (Objects.equals(this.color, currentRectangle.color)
                && Objects.equals(this.length, currentRectangle.length)
                && Objects.equals(this.width, currentRectangle.width));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 19 * result + (color == null ? 0 : color.hashCode());
        result = 21 + result + (length == null ? 0 : length.hashCode());
        result = 29 * result + (width == null ? 0 : width.hashCode());
        return result;
    }
}
