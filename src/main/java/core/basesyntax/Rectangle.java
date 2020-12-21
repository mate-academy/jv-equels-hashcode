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
            Rectangle firstRectangle = (Rectangle) rectangle;
            return (((width == firstRectangle.width)
                    || (width != null && width.equals(firstRectangle.width)))
                    && ((length == firstRectangle.length)
                    || (length != null && length.equals(firstRectangle.length)))
                    && ((color == firstRectangle.color)
                    || (color != null && color.equals(firstRectangle.color))));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = result + (width == null ? 0 : width);
        result = result + (length == null ? 0 : length);
        result = result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
