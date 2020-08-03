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
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) object;
        if (width == null && rectangle.width != null
                || width != null && !width.equals(rectangle.width)) {
            return false;
        }
        if (length == null && rectangle.length != null
                || length != null && !length.equals(rectangle.length)) {
            return false;
        }
        return color == null && rectangle.color == null
                || color != null && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (width == null ? 0 : width);
        result = 31 * result + (length == null ? 0 : length);
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
