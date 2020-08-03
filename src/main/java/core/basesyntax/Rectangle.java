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
        if (rectangle.color == null || rectangle.width == null || rectangle.length == null
                || color == null || width == null || length == null) {
            return this.hashCode() == rectangle.hashCode();
        }
        return width.equals(rectangle.width) && length.equals(rectangle.length)
                && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int primecode = 31;
        int result = 1;
        result = primecode * result + (width == null ? 0 : width);
        result = primecode * result + (length == null ? 0 : length);
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
