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
            Rectangle current = (Rectangle) obj;
            return compareField(this.width, current.width)
                    && compareField(this.length, current.length)
                    && compareField(this.color, current.color);
        }
        return false;
    }

    private boolean compareField(Integer first, Integer second) {
        if (first == null && second != null || first != null && second == null) {
            return false;
        }
        return first == null || first.equals(second);
    }

    private boolean compareField(String first, String second) {
        if (first == null && second != null || first != null && second == null) {
            return false;
        }
        return first == null || first.equals(second);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
