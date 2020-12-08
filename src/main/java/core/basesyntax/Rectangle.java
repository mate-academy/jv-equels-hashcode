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
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return (width == null && rectangle.width == null ? true :
                width != null ? width.equals(rectangle.width) : false)
                &&
                (length == null && rectangle.length == null ? true :
                        length != null ? length.equals(rectangle.length) : false)
                &&
                (color == null && rectangle.color == null ? true :
                        color != null ? color.equals(rectangle.color) : false);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (this.width != null ? width : 0);
        result = 31 * result + (this.length != null ? length : 0);
        result = 31 * result + (this.color != null ? this.color.hashCode() : 0);
        return result;
    }
}
