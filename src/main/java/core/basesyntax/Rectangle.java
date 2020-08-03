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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(Rectangle.class)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return (length == null || rectangle.length == null)
                ? length == rectangle.length :
                length.equals(rectangle.length)
                        && (width == null || rectangle.width == null)
                        ? width == rectangle.width :
                        width.equals(rectangle.width)
                                && (color == null || rectangle.color == null)
                                ? color == rectangle.color :
                                color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int result = 49;
        result = 13 * result + (color == null ? 0 : color.hashCode());
        result = 13 * result + (width == null ? 0 : width.hashCode());
        result = 13 * result + (length == null ? 0 : length.hashCode());
        return result;
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
