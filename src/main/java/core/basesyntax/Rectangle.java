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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return (length == null || rectangle.length == null)
                ? length == rectangle.length : length.equals(rectangle.length)
                && (width == null || rectangle.width == null)
                ? width == rectangle.width : width.equals(rectangle.width)
                && (color == null || rectangle.color == null)
                ? color == rectangle.color : color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int primecode = 31;
        int result = 1;
        result = primecode * result + (width == null ? 0 : width.hashCode());
        result = primecode * result + (length == null ? 0 : length.hashCode());
        result = primecode * result + (color == null ? 0 : color.hashCode());
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
