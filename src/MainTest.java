import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main;

    @Test
    void test_main() {

        int result1 = Main.count(3, 5);
        assertEquals(8, result1);

        int result2 = Main.count(0, 0);
        assertEquals(0, result2);


        int result3 = Main.count(-2, 7);
        assertEquals(5, result3);

        int result4 = Main.count(1,6);
        assertEquals(5,result4);
    }
}
