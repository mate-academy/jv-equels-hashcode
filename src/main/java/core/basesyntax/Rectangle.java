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
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            if (!this.getWidth().equals(rectangle.getWidth())) {
                return false;
            }
            if (!this.getLength().equals(rectangle.getLength())) {
                return false;
            }
            if (!this.getColor().equals(rectangle.getColor())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * Integer.parseInt(Integer.toBinaryString(this.length + 31));
        hash = hash * Integer.parseInt(Integer.toBinaryString(this.width + 31));
        hash = hash * Integer.parseInt(Integer.toBinaryString(this.color.charAt(1) + 31));
        return hash;
    }
}
