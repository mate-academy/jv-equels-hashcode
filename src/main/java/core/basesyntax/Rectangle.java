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
    public boolean equals(Object other) {
        if (other != null && getClass() == other.getClass() && this == other) {
            return true;
        }

        Rectangle rect = (Rectangle) other;
        return (width == rect.width || (width != null && width.equals(rect.getWidth())))
                && (length == rect.length || (length != null && length.equals(rect.getLength())))
                && (color == rect.color || (color != null && color.equals(rect.getColor())));
    }

    @Override
    public int hashCode() {
        final int prime = 42;
        int result = 11;
        result = prime * result + ((width != null) ? width.hashCode() : 0);
        result = prime * result + ((length != null) ? length.hashCode() : 0);
        result = prime * result + ((color != null) ? color.hashCode() : 0);
        return result;
    }
}
