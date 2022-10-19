import org.example.Service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    @Test
    public void getMessageTest() {
        String expectedStr = "Message Hey";

        Service service = new Service();
        String actualStr = service.getMessage();

        assertEquals(expectedStr, actualStr);
    }
}
