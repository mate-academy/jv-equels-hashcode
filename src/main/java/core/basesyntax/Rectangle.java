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
        if (rectangle == null) {
            return false;
        }
        if (this == rectangle) {
            return true;
        }
        if (!(rectangle.getClass().equals(Rectangle.class))) {
            return false;
        }
        Rectangle comparedRectangle = (Rectangle) rectangle;

        return ((width == comparedRectangle.width
                || (width != null && width.equals(comparedRectangle.width)))
                && (length == comparedRectangle.length
                || (length != null && length.equals(comparedRectangle.length)))
                && (color == comparedRectangle.color
                || (color != null && color.equals(comparedRectangle.color))));
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 23 * result + (width == null ? 0 : width);
        result = 31 * result + (length == null ? 0 : length);
        result = 43 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
