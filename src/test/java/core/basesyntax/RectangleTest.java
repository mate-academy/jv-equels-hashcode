package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    private static final Integer WIDTH_FIRST = 300;
    private static final Integer LENGTH_FIRST = 400;
    private static final String COLOR_FIRST = "red";

    private static final Integer WIDTH_SECOND = 300;
    private static final Integer LENGTH_SECOND = 400;
    private static final String COLOR_SECOND = "red";

    @Test
    public void equalityOfRectangle() {
        Rectangle firstRectangle = new Rectangle(WIDTH_FIRST, LENGTH_FIRST, COLOR_FIRST);
        Rectangle secondRectangle = new Rectangle(WIDTH_SECOND, LENGTH_SECOND, COLOR_SECOND);

        Assert.assertTrue("Test failed with first hash "
                        + firstRectangle.hashCode()
                        + " and second hash " + secondRectangle.hashCode()
                        + " and equals " + firstRectangle.equals(secondRectangle),
                firstRectangle.equals(secondRectangle));
    }
}
