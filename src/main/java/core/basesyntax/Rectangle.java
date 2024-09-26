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
            Rectangle comparedRectangle = (Rectangle) rectangle;
            return (color == comparedRectangle.color
                    || color != null && color.equals(comparedRectangle.color))
                && (length == comparedRectangle.length || length != null
                    && length.equals(comparedRectangle.length))
                && (width == comparedRectangle.width || width != null
                    && width.equals(comparedRectangle.width));
        }
        return false;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result * (width == null ? 0 : width.hashCode());
        return result;
    }
}
