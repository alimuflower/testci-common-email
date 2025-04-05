package hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello, CI!", HelloWorld.sayHello());
    }
}
