package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    static final int CONSTANT = 31;

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
        if (this == object) {
            return true;
        }

        if (null == object) {
            return false;
        }

        if (object.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) object;
            return ((null == width && null == rectangle.getWidth())
                            || width.equals(rectangle.getWidth()))
                    &&
                    ((null == length && null == rectangle.getLength())
                            || length.equals(rectangle.getLength()))
                    &&
                    color == rectangle.getColor();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = CONSTANT;
        if (null != width) {
            result += CONSTANT * width;
        }
        if (null != length) {
            result += CONSTANT * length;
        }
        if (null != color) {
            result += CONSTANT * color.hashCode();
        }
        return result;
    }
}
