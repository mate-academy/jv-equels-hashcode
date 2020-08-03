package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode()
 * так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }

        if (object.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) object;
            return (width == rectangle.width
                    || width != null && width.equals(rectangle.width))
                    && (length == rectangle.length
                    || length != null && length.equals(rectangle.length))
                    && (color == rectangle.color
                    || color != null && color.equals(rectangle.color));
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (width != null && length != null & color != null) {
            int result = 17;
            result = 31 * result + width.hashCode();
            result = 31 * result + length.hashCode();
            result = 31 * result + color.hashCode();
            return result;
        }
        return 0;
    }
}

/* if (this.getLength().equals(rectangle.getLength())
                    && this.getWidth().equals(rectangle.getWidth())
                    && this.getColor().equals(rectangle.getColor())) */

   /*     if (this.getLength() == object.getLength()
                && this.getWidth() == object.getWidth()
                && this.getColor().equals(object.getColor())) {
            return true;
        } */

   /*             if((rectangle.width==null || this.getWidth()==null)
                    || (rectangle.length==null || this.getLength()==null)
                    || (rectangle.color==null || this.getColor()==null)) {
                return rectangle.width==this.getWidth()
                        && rectangle.length==this.getLength()
                        && rectangle.color==this.getColor(); */
