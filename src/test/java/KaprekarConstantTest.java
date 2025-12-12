import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaprekarConstantTest {

    static KaprekarConstant kc;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void random() {
        int num= 6174;
        int expected = 6174;
        int actual = kc.checkConstant(num);
        assertEquals(expected,actual);

    }
}