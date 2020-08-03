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
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            if (rectangle.getColor() != null && rectangle.getWidth() != null
                    && rectangle.getLength() != null && color != null
                    & width != null && length != null) {
                return width == (rectangle.getWidth().intValue())
                        && length == (rectangle.getLength().intValue())
                        && color.equals(rectangle.getColor());
            } else {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 9;
        if (color != null) {
            result = 13 * result + width;
            result = 13 * result + length;
            result = 13 * result + color.hashCode();
        }
        return result;
    }
}
