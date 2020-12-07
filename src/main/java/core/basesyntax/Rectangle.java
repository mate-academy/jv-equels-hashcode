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
        Rectangle rectangle = (Rectangle) object;

        if ((rectangle.length == null && this.length == null
                || this.length.compareTo(rectangle.length) == 0)
                && (rectangle.color == null && this.color == null
                || this.color.equals(rectangle.color))
                && (rectangle.width == null && this.width == null
                || this.width.compareTo(rectangle.width) == 0)) {
            return (rectangle.getClass().equals(Rectangle.class));
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
