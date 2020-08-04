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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }

        if (object.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) object;
            if ((getWidth() == null && rectangle.getWidth() != null)
                    || (getWidth() != null && rectangle.getWidth() == null)
                    || (getLength() == null && rectangle.getWidth() != null)
                    || (getLength() != null && rectangle.getWidth() == null)
                    || (getColor() == null && rectangle.getColor() != null)
                    || (getColor() != null && rectangle.getColor() == null)) {
                return false;
            }

            return (((getWidth() == null && rectangle.getWidth() == null)
                    || getWidth().equals(rectangle.getWidth()))
                    && ((getLength() == null && rectangle.getWidth() == null)
                    || getLength().equals(rectangle.getLength()))
                    && ((getColor() == null && rectangle.getColor() == null)
                    || (getColor().equals(rectangle.getColor()))));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 23;
        if (width != null) {
            result = 31 * result * width;
        }
        if (length != null) {
            result = 31 * result * length;
        }
        if (color != null) {
            result = 31 * result * color.hashCode();
        }
        return result;
    }
}
