import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeTest {

    @Test
    public void isInclusiveWithBucketShouldBeTrue() {
        Range range = new Range("[1,5]");
        boolean actual = range.isStartWithInclusive();
        assertTrue(actual);
    }
}
