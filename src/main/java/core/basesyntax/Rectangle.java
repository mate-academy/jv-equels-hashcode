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
        if (this == rectangle) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle current = (Rectangle) rectangle;
            return (width == current.width || width != null && width.equals(current.width))
                    && (length == current.length || length != null && length.equals(current.length))
                    && (color == current.color || color != null && color.equals(current.color));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 17 * result + (width == null ? 0 : width.hashCode());
        result = 17 * result + (length == null ? 0 : length.hashCode());
        result = 17 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
