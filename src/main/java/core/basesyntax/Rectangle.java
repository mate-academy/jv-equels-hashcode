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
        result = 31 * result + (getLength() == null ? 0 : getLength().hashCode());
        result = 31 * result + (getWidth() == null ? 0 : getWidth().hashCode());
        result = 31 * result + (getColor() == null ? 0 : getColor().hashCode());
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

        return width == null
                ? width == rect.width : width.equals(width)
                && (length == null || rect.length == null)
                ? length == rect.length : length.equals(rect.length)
                && (color == null || rect.color == null)
                ? color == rect.color : color.equals(rect.color);
    }
}
