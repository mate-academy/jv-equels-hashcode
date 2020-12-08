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
            Rectangle current = (Rectangle) rectangle;
            return ((width == current.width
                    || (width != null && width.equals(current.width)))
                    && (length == current.length
                    || (length != null && length.equals(current.length)))
                    && (color == current.color
                    || (color != null && color.equals(current.color))));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + (width != null ? width.hashCode() : 0);
        hashCode = 31 * hashCode + (length != null ? length.hashCode() : 0);
        hashCode = 31 * hashCode + (color != null ? color.hashCode() : 0);
        return hashCode;
    }
}
