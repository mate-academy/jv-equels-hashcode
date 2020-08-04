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

        if (obj.getClass().equals(Rectangle.class)) {
            Rectangle rect = (Rectangle) obj;

            return (width == null && rect.width == null
                    || width.equals(rect.width))
                    && (length == null && rect.length == null
                    || length.equals(rect.length))
                    && (color == null && rect.color == null
                    || color.equals(rect.color));
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 11;

        result = getWidth() != null ? 23 * result + width.hashCode() : result;
        result = getLength() != null ? 23 * result + length.hashCode() : result;
        result = getColor() != null ? 23 * result + color.hashCode() : result;

        return result;
    }
}
