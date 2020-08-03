package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private static final int HASHCODENUMBER = 52;
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
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) obj;
            return (color != null && color.equals(rectangle.color)
                    || (rectangle.color == null && color == null))
                    && (width != null && width.equals(rectangle.width)
                    || (rectangle.width == null && width == null))
                    && (length != null && length.equals(rectangle.length)
                    || (rectangle.length == null && length == null));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = width != null ? HASHCODENUMBER * result + width.hashCode() : HASHCODENUMBER;
        result = length != null ? HASHCODENUMBER * result + length.hashCode()
                : HASHCODENUMBER * result;
        result = color != null ? HASHCODENUMBER * result + color.hashCode() : HASHCODENUMBER % 10;
        return result;
    }
}
