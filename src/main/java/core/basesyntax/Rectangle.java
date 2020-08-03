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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (width == null || length == null || color == null) {
            return true;
        }
        Rectangle rectangle = (Rectangle) object;
        return width.equals(rectangle.width) && length.equals(rectangle.length)
                && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        if (length != null || color != null || width != null) {
            int result = 14;
            result = 13 * result + width.hashCode();
            result = 13 * result + color.hashCode();
            result = 13 * result + length.hashCode();
            return result;
        }
        return 0;
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

}
