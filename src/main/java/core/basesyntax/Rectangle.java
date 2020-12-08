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

    public boolean equals(Rectangle rectangle) {
        if (this == rectangle) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            return (width == rectangle.width
                    || width != null && width.equals(rectangle.width))
                    && (length == rectangle.length
                    || length != null && length.equals(rectangle.length))
                    && (color == rectangle.color
                    || color != null && color.equals(rectangle.color));
        }
        return false;
    }

    public int hashCode() {
        int result = 17;
        result = 23 * result + (width == null ? 0 : width.hashCode());
        result = 23 * result + (length == null ? 0 : length.hashCode());
        result = 23 * result + (color == null ? 0 : color.hashCode());
        return result;
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
