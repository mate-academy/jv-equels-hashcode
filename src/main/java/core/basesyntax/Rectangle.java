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
            return getColor() != null ? getColor().equals(rectangle.getColor())
                    : rectangle.getColor() == null
                    && getLength() != null ? getLength().equals(rectangle.getLength())
                    : rectangle.getLength() == null
                    && getColor() != null ? getWidth().equals(rectangle.getWidth())
                    : rectangle.getWidth() == null;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (getColor() != null) {
            result = prime * result + getColor().hashCode();
        }
        if (getLength() != null) {
            result = prime * result + getLength().hashCode();
        }
        if (getWidth() != null) {
            result = prime * result + getWidth().hashCode();
        }
        return result;
    }
}
