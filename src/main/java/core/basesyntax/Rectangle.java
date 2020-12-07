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
        if (rectangle == null){
            return false;
        }
        if (rectangle == this){
            return true;
        }

        if(this.width == null || this.length == null || this.color == null){
            return true;
        }

        if (rectangle.getClass().equals(Rectangle.class)){
            Rectangle rectangleCurrent = (Rectangle) rectangle;
            return this.width.equals(rectangleCurrent.width)
                    && this.length.equals(rectangleCurrent.length)
                    && this.color.equals(rectangleCurrent.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31 * res + (width == null ? 0 : width.hashCode());
        res = 31 * res + (length == null ? 0 : length.hashCode());
        res = 31 * res + (color == null ? 0 : color.hashCode());
        return res;
    }
}
