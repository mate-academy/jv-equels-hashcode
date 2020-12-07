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
            return (this.width == compareRectangle.getWidth()
                    || this.width.equals(compareRectangle.getWidth()))
                    && (this.length == compareRectangle.getLength()
                    || this.length.equals(compareRectangle.getLength()))
                    && (this.color == compareRectangle.getColor()
                    || this.color.equals(compareRectangle.getColor()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash *= 31 + (this.length == null ? 0 : this.length);
        hash *= 31 + (this.color == null ? 0 : this.color.length());
        hash *= 31 + (this.width == null ? 0 : this.width);
        return hash;
    }
}
