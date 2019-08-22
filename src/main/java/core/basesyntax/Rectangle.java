package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей width и length,
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
    public boolean equals(Object ob) {
        if (ob == null || !(ob instanceof Rectangle)) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        Rectangle r = (Rectangle)ob;
        if ((width.intValue() == r.getWidth()) && (length.intValue() == r.getLength())
                && (getColor().length() == r.getColor().length())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result *= (width != null) ? width : 0;
        result += 31 * (length != null ? length : 0);
        result += 31 * (color != null ? color.length() : 0);
        return result;
    }
}
