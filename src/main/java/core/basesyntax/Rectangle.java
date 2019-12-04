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
    public int hashCode() {
        return getByteSum(this.color) * this.getWidth() * this.getLength();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            Rectangle rectObj = (Rectangle)obj;
            if (this.width - rectObj.getWidth() == 0) {
                if (this.length - rectObj.getLength() == 0) {
                    return this.color.equals(rectObj.getColor());
                }
            }
        }
        return false;
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

    private int getByteSum(String str) {
        byte[] bytes = str.getBytes();
        int sum = 0;
        for (byte tmp : bytes) {
            sum += tmp;
        }
        return sum;
    }
}
