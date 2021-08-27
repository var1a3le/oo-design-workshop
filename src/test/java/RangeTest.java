import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    public void isStartWithInclusiveWithBucketShouldBeTrue() {
        Range range = new Range("[1,5]");
        boolean actual = range.isStartWithInclusive();
        assertTrue(actual);
    }

    @Test
    public void isStartWithInclusiveWithBucketShouldBeFalse() {
        Range range = new Range("(1,5]");
        boolean actual = range.isStartWithInclusive();
        assertFalse(actual);
    }

    @Test
    public void getStatInputShouldbe1() {
        Range range = new Range("(1,5]");
        int actual = range.getStartInput();
        assertEquals(1, actual);
    }

    @Test
    public void isEndWithInclusiveWithBracketShouldBeTrue() {
        Range range = new Range("[1,5]");
        boolean actual = range.isEndWithInclusive();
        assertTrue(actual);
    }

    @Test
    public void isEndWithInclusiveWithOutBracketShouldBeTrue() {
        Range range = new Range("[1,5)");
        boolean actual = range.isEndWithInclusive();
        assertFalse(actual);
    }

    @Test
    public void getEndInputShouldbe5() {
        Range range = new Range("(1,5]");
        int actual = range.getEndInput();
        assertEquals(5, actual);
    }
}
