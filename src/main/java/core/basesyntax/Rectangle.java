package core.basesyntax;

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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        Rectangle rectangle = (Rectangle)obj;
        if (color == null) {
            if (rectangle.color != null) {
                return false;
            }
        }
        if (color == null && rectangle.color == null && width == null && rectangle.width == null
                && length == null && rectangle.length == null) {
            return true;
        }

        if (obj.getClass().equals(Rectangle.class)) {
            return rectangle.getWidth().equals(this.getWidth()) && rectangle.getLength()
                    .equals(this.getLength()) && rectangle.getColor().equals(this.getColor());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + (width == null ? 0 : width);
        result = 31 * result + (length == null ? 0 : length);
        return result;
    }
}
