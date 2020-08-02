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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        if (width == null && rectangle.width != null
                || width != null && !width.equals(rectangle.width)) {
            return false;
        }
        if (length == null && rectangle.length != null
                || length != null && !length.equals(rectangle.length)) {
            return false;
        }
        return color == null && rectangle.color == null
               || color != null && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + (width == null ? 0 : width);
        result = prime * result + (length == null ? 0 : length);
        result = prime * result + (color == null ? 0 : color.hashCode());
        return result;
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
