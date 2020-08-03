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
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width || (width != null
                && width.equals(rectangle.getWidth())
                && (length == rectangle.length || (length != null
                && length.equals(rectangle.getLength())))
                && (color == rectangle.color || (color != null
                && color.equals(rectangle.getColor()))));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((width == null) ? 0 : width.hashCode());
        result = prime * result + ((length == null) ? 0 : length.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}

