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
        if (!getClass().equals(object.getClass()) || object == null) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return (length == null)
                ? length == rectangle.length : length.equals(rectangle.length)
                && (width == null || rectangle.width == null)
                ? width == rectangle.width : width.equals(rectangle.width)
                && (color == null || rectangle.color == null)
                ? color == rectangle.color : color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int result = 51;
        result = 31 * result + (getLength() != null ? getLength().hashCode() : 0);
        result = 31 * result + (getWidth() != null ? getWidth().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }
}
