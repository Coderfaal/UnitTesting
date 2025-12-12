import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaprekarConstantTest3 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkConstant() {

       // String s = "12";

        assertEquals("0012",String.format("%04d",12));
        assertEquals("0123",String.format("%04d",123));

    }
}
