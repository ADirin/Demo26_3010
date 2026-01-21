import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CalTest {
Cal cal= new Cal();
    @org.junit.jupiter.api.Test
    public void addMe() {
        assertEquals(14, cal.addMe(12,2));
    }

    @org.junit.jupiter.api.Test
    void subtractMe() {
        assertEquals(10, cal.subtractMe(12,2));
    }

    @org.junit.jupiter.api.Test
    void multiplyMe() {
        assertEquals(24, cal.multiplyMe(12,2));
    }

    @org.junit.jupiter.api.Test
    void divideMe() {
        assertEquals(6, cal.divideMe(12,2));
    }
}