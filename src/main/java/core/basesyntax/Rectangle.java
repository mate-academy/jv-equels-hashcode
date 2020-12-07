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
        if (rectangle == null || rectangle.getClass() != this.getClass()) {
            return false;
        }
        Rectangle castedRectangle = (Rectangle) rectangle;
        return (width == (castedRectangle.width)
                || (width != null && width.equals(castedRectangle.width)))
                && (length == (castedRectangle.length)
                || (length != null && length.equals(castedRectangle.length)))
                && (color == (castedRectangle.color)
                || (color != null && color.equals(castedRectangle.color)));
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 7 * result + (width == null ? 0 : width.hashCode());
        result = 7 * result + (length == null ? 0 : length.hashCode());
        result = 7 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
