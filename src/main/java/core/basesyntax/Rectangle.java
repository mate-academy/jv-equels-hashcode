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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle)obj;
            return (color == rectangle.color || (color != null
                    && color.equals(rectangle.color)))
                    && (length == rectangle.length || length != null
                    && length.equals(rectangle.length))
                    && ((width == rectangle.width || width != null
                    && width.equals(rectangle.width)));

        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + (width == null ? 0 : width);
        result = 31 * result + (length == null ? 0 : length);
        return result;
    }
}
