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
    public int hashCode() {
        int result = 61;
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(Rectangle.class)) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;

        return (length != null)
                ? length.equals(rect.length) : length == rect.length
                && (width != null && rect.width != null)
                ? width.equals(rect.width) : width == rect.width
                && (color != null && rect.color != null)
                ? color.equals(rect.color) : color == rect.color;
    }
}
