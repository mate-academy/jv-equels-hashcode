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

        Rectangle current = (Rectangle) rectangle;

        if (rectangle == this) {
            return true;
        }

        if (rectangle == null) {
            return false;
        }

        if(rectangle.getClass().equals(Rectangle.class)) {
            return colorCheck(current) && lengthCheck(current) && widthCheck(current);
        }

        return false;
    }

    private boolean colorCheck (Rectangle current) {
        if (current.color == null) {
            if (current.color == this.color) {
                return true;
            }
        } else {
            if (current.color.equals(this.color)) {
                return true;
            }
        }
        return false;
    }

    private boolean lengthCheck (Rectangle current) {
        if (current.length == null) {
            if (current.length == this.length) {
                return true;
            }
        } else {
            if (current.length.equals(this.length)) {
                return true;
            }
        }
        return false;
    }

    private boolean widthCheck (Rectangle current) {
        if (current.width == null) {
            if (current.width == this.width) {
                return true;
            }
        } else {
            if (current.width.equals(this.width)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (this.length == null ? 0 : this.length);
        result = 31 * result + (this.width == null ? 0 : this.width);
        result = 31 * result + (this.color == null ? 0 : this.color.hashCode());
        return result;
    }
}
