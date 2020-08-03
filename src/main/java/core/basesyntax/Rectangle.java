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
            Rectangle rectangle = (Rectangle) obj;
            return color == rectangle.color || color != null && color.equals(rectangle.color)
                    && length == rectangle.length
                    || length != null && length.equals(rectangle.length)
                    && width == rectangle.width
                    || width != null && width.equals(rectangle.width);
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (this.length == null || this.color == null || this.width == null) {
            return 0;
        }
        final int prime = 31;
        int result = 17;
        result = prime * result + width.hashCode();
        result = prime * result + color.hashCode();
        result = prime * result + length.hashCode();
        return result;
    }
}
