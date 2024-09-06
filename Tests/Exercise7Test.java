import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Exercise7Test {

    Exercise7 e7;
    int [][] m = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

    @BeforeEach
    void setUp() {
        e7 = new Exercise7();
    }

    @Test
    @DisplayName("Get matrix total")
    void getTotal() {
        assertEquals(40, e7.getTotal(m), "Incorrect matrix total");
    }

    @Test
    @DisplayName("Get matrix average")
    void getAverage() {
        assertEquals(2.5, e7.getAverage(m), "Incorrect matrix average");
    }
}