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
        Rectangle castedRectangle = (Rectangle) rectangle;
        if (castedRectangle == this) {
            return true;
        }
        if (castedRectangle == null) {
            return false;
        }
        if (castedRectangle.getClass().equals(Rectangle.class)) {
            if (width == null && castedRectangle.width != null) {
                return false;
            }
            if (length == null && castedRectangle.length != null) {
                return false;
            }
            if (color == null && castedRectangle.color != null) {
                return false;
            }
            if (width == null && length == null && color == null) {
                return true;
            }
            return this.width.equals(castedRectangle.width)
                && this.length.equals(castedRectangle.length)
                && this.color.equals(castedRectangle.color);
        }
        return false;
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
