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
    public int hashCode() {
        int result = 5;
        result = 17 * result + (width == null ? 0 : width.hashCode());
        result = 17 * result + (length == null ? 0 : length.hashCode());
        result = 17 * result + (color == null ? 0 : color.hashCode());
        return result;
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
            Rectangle currentRectangle = (Rectangle) rectangle;
            return ((width == currentRectangle.width)
                    || (width != null) && width.equals(currentRectangle.width))
                    && ((length == currentRectangle.length)
                    || (length != null) && length.equals(currentRectangle.length))
                    && ((color == currentRectangle.color)
                    || (color != null) && color.equals(currentRectangle.color));
        }
        return false;
    }
}
