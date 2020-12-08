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


        if (rectangle.getClass().equals(Rectangle.class)){
            Rectangle rectangleCurrent = (Rectangle) rectangle;
            return ((width == rectangleCurrent.width
                    || (width != null && width.equals(rectangleCurrent.width)))
                    && (length == rectangleCurrent.length
                    || (length != null && length.equals(rectangleCurrent.length)))
                    && (color == rectangleCurrent.color
                    || (color != null && color.equals(rectangleCurrent.color))));
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
