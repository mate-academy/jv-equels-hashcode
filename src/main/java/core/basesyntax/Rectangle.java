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
        System.out.println(width + " -- " + length + " -- " + color);

        if (this == object) {
            return true;
        }

        if (null == object) {
            return false;
        }

        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            return checkNullOrEquals(width, rectangle.getWidth())
                    &&
                    checkNullOrEquals(length, rectangle.getLength())
                    &&
                    color == rectangle.getColor();
        }
        return false;
    }

    private boolean checkNullOrEquals(Integer a, Integer b) {
        return (null == a && null == b || a.equals(b));
    }

    @Override
    public int hashCode() {
        int result = 13;
        if (null != width) {
            result += 7 * width;
        }
        if (null != length) {
            result += 3 * length;
        }
        if (null != color) {
            result += 11 * color.hashCode();
        }
        return result;
    }
}
