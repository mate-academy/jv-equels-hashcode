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
        if (!rectangle.getClass().equals(Rectangle.class)) {
            return false;
        }
        Rectangle castedRectangle = (Rectangle) rectangle;
        return ((color == null && castedRectangle.color == null)
                || (color != null && color.equals(castedRectangle.color)))
                && ((width == null && castedRectangle.width == null)
                || (width != null && width.equals(castedRectangle.width)))
                && ((length == null && castedRectangle.length == null)
                || (length != null && length.equals(castedRectangle.length)));
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = 71 * result + (color == null ? 0 : color.hashCode());
        result = 71 * result + (width == null ? 0 : width.hashCode());
        result = 71 * result + (length == null ? 0 : length.hashCode());
        return result;
    }
}
