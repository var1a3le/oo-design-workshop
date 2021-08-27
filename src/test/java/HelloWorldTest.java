import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void helloTest() {
        // Arrange
        HelloWorld helloWorld = new HelloWorld();
        // Act
        String actual = helloWorld.greeting("New");
        // Assert
        assertEquals("Hello New", actual);
    }
}