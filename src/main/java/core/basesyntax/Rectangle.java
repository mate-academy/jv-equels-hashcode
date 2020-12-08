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
            return ((width == rectangle.width)
                    || (width != null && width.equals(rectangle.width)))
                    && ((length == rectangle.length)
                    || (length != null && length.equals(rectangle.length)))
                    && ((color == rectangle.color)
                    || (color != null && color.equals(rectangle.color)));
        }
        return false;
    }

    public int hashCode() {
        if (getWidth() == null
                || getLength() == null
                || color == null) {
            return 0;
        }
        return ((width + 17) * 23 + length) * 31 + color.hashCode();
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
