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

    public boolean equals(Rectangle rectangle) {
        if (rectangle == null) {
            return false;
        }
        if (rectangle == this) {
            return true;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle compareRectangle = (Rectangle) rectangle;
            return (width == compareRectangle.getWidth()
                    || width.equals(compareRectangle.getWidth()))
                    && (length == compareRectangle.getLength()
                    || length.equals(compareRectangle.getLength()))
                    && (color == compareRectangle.getColor()
                    || color.equals(compareRectangle.getColor()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode *= 31 + (length == null ? 0 : length);
        hashCode *= 31 + (color == null ? 0 : color.hashCode());
        hashCode *= 31 + (width == null ? 0 : width);
        return hashCode;
    }
}
