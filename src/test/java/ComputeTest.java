import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ComputeTest {

    static Compute compute;


    @BeforeAll
    static public void beforeAll() {
        compute= null;
    }

    @AfterAll
    static public  void afterAll() {
        compute=null;
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Before each , debug msg");
    }
    @AfterEach
    void afterEach(){
        System.out.println("after each ,debug msg");

    }



    @Test
    void add() {
       // fail("Not yet Implemented");
        double a=10;
        double b =20;
        double expected = 30;
        double actual= compute.add(a,b);
        assertEquals(expected,actual);


    }



}