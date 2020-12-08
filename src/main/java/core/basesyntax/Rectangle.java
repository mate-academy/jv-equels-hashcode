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

    @Override
    public int hashCode() {
        return 17 * 31 + (width == null ? 0 : width.hashCode())
                * 17 * 31 + (length == null ? 0 : length.hashCode())
                * 17 * 31 + (color == null ? 0 : color.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return (width == rectangle.width
                || (width != null && width.equals(rectangle.width)))
                && (length == rectangle.length
                || (length != null && length.equals(rectangle.length)))
                && (color == rectangle.color
                || (color != null && color.equals(rectangle.color)));
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
