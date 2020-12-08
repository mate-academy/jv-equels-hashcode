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
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if ((object.getClass().equals(Rectangle.class))) {
            Rectangle rectangle = (Rectangle) object;
            return (rectangle.length == null && length == null
                    || length.equals(rectangle.length))
                    && (rectangle.color == null && color == null
                    || color.equals(rectangle.color))
                    && (rectangle.width == null && width == null
                    || width.equals(rectangle.width));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += color != null ? 31 * color.hashCode() : 0;
        result *= width != null ? 31 * width.hashCode() : 1;
        result *= length != null ? 37 * length.hashCode() : 1;
        return result;
    }
}
