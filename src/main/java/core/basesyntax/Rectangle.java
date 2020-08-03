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

        if (getClass() != object.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) object;
        if ((getWidth() == null && rectangle.getWidth() == null)
                && (getLength() == null && rectangle.getLength() == null)
                && (getColor() == null && rectangle.getColor() == null)) {
            return true;
        }

        if (getWidth().equals(rectangle.getWidth())
                && getLength().equals(rectangle.getLength())
                && getColor().equals(rectangle.getColor())) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 31;

        if (getColor() == null) {
            result = prime * result;
        } else {
            result = prime * result + getColor().hashCode();
        }

        if (getLength() == null) {
            result = prime * result;
        } else {
            result = prime * result + getLength();
        }

        if (getWidth() == null) {
            result = prime * result;
        } else {
            result = prime * result + getWidth();
        }
        return result;
    }
}
