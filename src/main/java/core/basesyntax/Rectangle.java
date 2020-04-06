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
        if (this.getClass().equals(obj.getClass())) {
            Rectangle rect = (Rectangle) obj;
            return (width.equals(rect.width)
                    && length.equals(rect.length)
                    && color.equals(rect.color)
                    && this.hashCode() == rect.hashCode());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int num = 3;
        num = 31 * num + (color != null ? color.hashCode() : 0);
        num = 31 * num + (color != null ? length.hashCode() : 0);
        num = 31 * num + (color != null ? width.hashCode() : 0);
        return num;
    }
}
