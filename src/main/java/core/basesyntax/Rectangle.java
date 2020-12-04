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
        if (this.width == null && comparedRectangle.width == null
                && this.length == null && comparedRectangle.length == null
                && this.color == null && comparedRectangle.color == null) {
            return true;
        }
        return ((this.width.equals(comparedRectangle.width))
                    && (this.length.equals(comparedRectangle.length))
                    && (this.color.equals(comparedRectangle.color))
                    && (this.hashCode() == rectangle.hashCode()));
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
