package com.junit.performancetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(true);
    }
}
