import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaprekarConstantTest4 {
    static KaprekarConstant kc;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkFor0000() {
        int num=0000;
        assertEquals(0,kc.checkConstant(num));
    }
}