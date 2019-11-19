package chat;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChatTest {
@Test public void testAppHasAGreeting() {
        Chat classUnderTest = new Chat();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
}
}
