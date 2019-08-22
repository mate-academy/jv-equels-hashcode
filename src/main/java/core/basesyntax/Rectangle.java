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

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj instenceof Rectangle) {
            Rectangle rec = (Rectangle) obj;
        } else {
            return false;
        }
        return this.getColor().equals(rec.getColor()) && this.getLength() == rec.getLength()
                && this.getWidth() == rec.getWidth();
    }

    @Override
    public int hashCode() {
        return 31 * (this.getWidth() + this.getColor().length() + this.getLength());
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
