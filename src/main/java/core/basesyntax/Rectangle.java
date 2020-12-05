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
            Rectangle rectangle1 = (Rectangle) rectangle;
            return Objects.equals(getColor(), rectangle1.color)
                    && Objects.equals(getLength(), rectangle1.length)
                    && Objects.equals(getWidth(), rectangle1.width);
        }
        return false;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (getColor() == null ? 0 : color.hashCode());
        result = 31 * result + (getLength() == null ? 0 : getLength());
        result = 31 * result * (getWidth() == null ? 0 : getWidth());
        return result;
    }
}
