package core.basesyntax;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            Rectangle rect = (Rectangle) obj;
            return width.equals(rect.width)
                    && length.equals(rect.length)
                    && color.equals(rect.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int a = 17;
        a = width == null ? prime * a
                : prime * a + width.hashCode();
        a = length == null ? prime * a
                : prime * a + length.hashCode();
        a = color == null ? prime * a
                : prime * a + color.hashCode();
        return a;
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
