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
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        if ((this.getColor() == null ^ rectangle.getColor() == null)
                || (this.getWidth() == null ^ rectangle.getWidth() == null)
                || (this.getLength() == null ^ rectangle.getLength() == null)) {
            return false;
        }
        return ((this.getColor() == null && rectangle.getColor() == null)
                || (this.getColor().equals(rectangle.getColor())))
                && ((this.getLength() == null && rectangle.getLength() == null)
                || (this.getLength().equals(rectangle.getLength())))
                && ((this.getWidth() == null && rectangle.getWidth() == null)
                || (this.getWidth().equals(rectangle.getWidth())));
    }

    @Override
    public int hashCode() {
        int result = 3;
        if (width != null) {
            result = result * 11 + width.hashCode();
        }

        if (length != null) {
            result = result * 11 + length.hashCode();
        }

        if (color != null) {
            result = result * 11 + color.hashCode();
        }
        return result;
    }
}
