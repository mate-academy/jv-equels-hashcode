package core.basesyntax;

/**
 * Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей width и length,
 * а hashCode() был бы согласованным с реализацией equals().
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rectangle) {
            Rectangle comparedRectangle = (Rectangle) obj;
            if (width.intValue() != comparedRectangle.getWidth()) {
                return false;
            }
            if (length.intValue() != comparedRectangle.getLength()) {
                return false;
            }
            if (!color.equals(comparedRectangle.getColor())) {
                return false;
            }
            return true;

        }
        return false;
    }

    public int hashCode() {
        return 31 * (width + length) + color.hashCode();
    }
}
