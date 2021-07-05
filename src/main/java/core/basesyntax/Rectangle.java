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
    public boolean equals(Object rectangle) {
        if (rectangle == this) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle rectangle1 = (Rectangle) rectangle;
            return (color == rectangle1.color
                    || (color != null && color.equals(rectangle1.color)))
                    && (length == rectangle1.length
                    || (length != null && length.equals(rectangle1.length)))
                    && (width == rectangle1.width
                    || (width != null && width.equals(rectangle1.width)));
        }
        return false;
    }

    public int hashCode() {
        int result = 23;
        result = 23 * result + (width == null ? 0 : width.hashCode());
        result = 23 * result + (length == null ? 0 : length.hashCode());
        result = 23 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
