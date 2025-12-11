import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberOrNotTest {

 static PrimeNumberOrNot pm= new PrimeNumberOrNot();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @ParameterizedTest(name="{index} - {0} is Prime")
    @ValueSource(ints = {2,5,6,7,8,9} )
    void checkPrimrOrNot(double number) {

            boolean actual = pm.checkPrimerOrNot(number);
            assertTrue(actual);
        }

    }

