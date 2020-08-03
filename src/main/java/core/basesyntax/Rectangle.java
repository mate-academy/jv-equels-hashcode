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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return (width == rectangle.width || width.equals(rectangle.width))
                && (length == rectangle.length || length.equals(rectangle.length))
                && (color == rectangle.color || color.equals(rectangle.color));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result * (width == null ? 0 : width);
        result = 31 * result * (length == null ? 0 : length);
        result = 31 * result * (color == null ? 0 : color.hashCode());
        return result;
    }
}
