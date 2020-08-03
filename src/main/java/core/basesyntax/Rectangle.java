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
        if (object.getClass().equals(Rectangle.class) && (object != null)) {
            if (this == object) {
                return true;
            }
            Rectangle rectangle = (Rectangle) object;
            return (width == rectangle.width
                    || (width != null && width.equals(rectangle.width)))
                    && (length == rectangle.length
                    || (length != null && length.equals(rectangle.length)))
                    && (color == rectangle.color
                    || (color != null && color.equals(rectangle.color)));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int variable = 5;
        int result = 10;
        result = variable * result + ((length == null) ? 0 : length.hashCode());
        result = variable * result + ((width == null) ? 0 : width.hashCode());
        result = variable * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}
