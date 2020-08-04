package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
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

        if (object.getClass() == Rectangle.class) {
            Rectangle rectangle = (Rectangle) object;
            boolean check1 = width != null && color != null && length != null
                    && rectangle.width != null && rectangle.color != null && rectangle.length != null;
            boolean check2 = width == null && color == null && length == null
                    && rectangle.width == null && rectangle.color == null && rectangle.length == null;
            return check1 ? (width.equals(rectangle.width)
                    && length.equals(rectangle.length)
                    && color.equals(rectangle.color)) : check2;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = width != null ? 31 * hashCode + width.hashCode() : 31 * hashCode;
        hashCode = length != null ? 31 * hashCode + length.hashCode() : 31 * hashCode;
        hashCode = color != null ? 31 * hashCode + color.hashCode() : 31 * hashCode;
        return hashCode;
    }
}
