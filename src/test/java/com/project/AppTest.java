package com.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreatestWithDistinctNumbers() {
        assertEquals(25, App.findGreatest(12, 25, 9));
    }

    @Test
    public void testGreatestWithEqualNumbers() {
        assertEquals(10, App.findGreatest(10, 10, 10));
    }

    @Test
    public void testGreatestWithNegativeNumbers() {
        assertEquals(-2, App.findGreatest(-5, -10, -2));
    }

    @Test
    public void testGreatestWhenTwoAreEqual() {
        assertEquals(8, App.findGreatest(8, 8, 5));
    }
}
