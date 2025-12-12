import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaprekarConstantTest2 {


    static KaprekarConstant kc;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void check1111() {
        int num=1111;
     //int expected =0;
     //int actual =  kc.checkConstant(num);
     assertEquals(0, kc.checkConstant(num));


    }
}