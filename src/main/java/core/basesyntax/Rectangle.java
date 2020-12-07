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
    public boolean equals(Object rect) {
        if (rect == this) {
            return true;
        }
        if (rect == null) {
            return false;
        }
        if (rect.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) rect;
            return ((this.width == rectangle.width || this.width != null
                    && this.width.equals(rectangle.width))
                && (this.length == rectangle.length || this.length != null
                    && this.length.equals(rectangle.length))
                && (this.color == rectangle.color || this.color != null
                    && this.color.equals(rectangle.color)));

        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 3;
        result = 5 * result + (color == null ? 0 : color.hashCode());
        result = 5 * result + (length == null ? 0 : length);
        result = 5 * result + (width == null ? 0 : width);
        return result;
    }
}
