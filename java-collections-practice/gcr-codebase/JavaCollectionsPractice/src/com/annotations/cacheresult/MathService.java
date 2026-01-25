package com.annotations.cacheresult;

public class MathService {

    @CacheResult
    public int square(int number) {

        // Simulate expensive computation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return number * number;
    }
}