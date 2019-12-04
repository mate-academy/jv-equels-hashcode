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

    public int hashCode() {
        int result = 1;
        result = 31 * result + (width != null ? width : 0);
        result = 31 * result + (length != null ? length : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Rectangle recOther = (Rectangle) obj;

        return color.equals(recOther.getColor())
                && width.equals(recOther.getWidth())
                && length.equals(recOther.getLength());

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
}
