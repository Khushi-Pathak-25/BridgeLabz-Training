package com.annotations.cacheresult;

public class ExpensiveService {
    // Expensive computation method
    @CacheResult
    public int square(int number) {
        // for heavy computation time
        for (int i = 0; i < 100000000; i++) {
        }

        return number * number;
    }
}